package com.flixclusive.domain.model.tmdb

import androidx.annotation.StringRes
import com.flixclusive.R

enum class FilmType(
    val type: String,
    @StringRes val resId: Int
) {
    MOVIE(
        type = "movie",
        resId = R.string.movies
    ),
    TV_SHOW(
        type = "tv",
        resId = R.string.tv_shows
    );

    companion object {
        fun String?.toFilmType(): FilmType {
            var result = FilmType.values().find { it.type == this }
            if(result == null) {
                result = when(this) {
                    "TV Series" -> TV_SHOW
                    "Movie" -> MOVIE
                    else -> throw IllegalStateException("Invalid film type: $this")
                }
            }

            return result
        }
    }
}