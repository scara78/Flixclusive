package com.flixclusive.data.dto.tmdb.tv

import com.flixclusive.domain.model.tmdb.Season
import com.flixclusive.presentation.common.Functions.isDateInFuture
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class TvShowSeasonsPreview(
    @SerializedName("air_date") val airDate: String?,
    @SerializedName("episode_count") val episodeCount: Int,
    val id: Int,
    val name: String,
    val overview: String?,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("season_number") val seasonNumber: Int
)

fun TvShowSeasonsPreview.toSeason(): Season {
    return Season(
        seasonNumber = seasonNumber,
        image = posterPath,
        episodes = emptyList(),
        isReleased = if(airDate != null) isDateInFuture(airDate) else true
    )
}