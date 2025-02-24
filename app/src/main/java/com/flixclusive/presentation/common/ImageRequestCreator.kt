package com.flixclusive.presentation.common

import android.content.Context
import coil.request.ImageRequest
import com.flixclusive.common.Constants.IMAGE_BASE_URL

object ImageRequestCreator {
    fun Context.buildImageUrl(
        imagePath: String?,
        imageSize: String = "w500"
    ): ImageRequest {
        val imageRequest = ImageRequest.Builder(this)
        val pattern = "(https?://.+?/p/)([^/]+)(/.+)".toRegex()

        imageRequest.apply {
            data(
                if (imagePath.isNullOrEmpty()) {
                    null
                } else if (pattern.matches(imagePath)) {
                    val replacedUrl = pattern.replace(imagePath) { matchResult ->
                        val originalString = matchResult.groupValues[2]
                        matchResult.value.replace(originalString, imageSize)
                    }
                    replacedUrl
                } else {
                    "$IMAGE_BASE_URL$imageSize$imagePath"
                }
            )
        }

        return imageRequest
            .crossfade(true)
            .build()
    }

}
