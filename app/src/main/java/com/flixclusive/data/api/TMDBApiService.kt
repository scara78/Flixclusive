package com.flixclusive.data.api

import android.os.Build
import com.flixclusive.data.dto.tmdb.common.TMDBGenresDto
import com.flixclusive.data.dto.tmdb.common.TMDBImagesResponseDto
import com.flixclusive.data.dto.tmdb.TMDBMovieDto
import com.flixclusive.domain.model.tmdb.TMDBPageResponse
import com.flixclusive.data.dto.tmdb.TMDBTvShowDto
import com.flixclusive.data.dto.tmdb.tv.TMDBSeasonDto
import com.flixclusive.domain.model.tmdb.TMDBSearchItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale

interface TMDBApiService {
    @GET("movie/{id}")
    suspend fun getMovie(
        @Path("id") id: Int,
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "en-US",
        @Query("append_to_response") appendToResponse: String = "images,recommendations",
        @Query("page") page: Int = 1,
        @Query("include_image_language") includeImageLanguage: String = "en"
    ): TMDBMovieDto

    @GET("tv/{id}")
    suspend fun getTvShow(
        @Path("id") id: Int,
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "en-US",
        @Query("append_to_response") appendToResponse: String = "images,recommendations",
        @Query("page") page: Int = 1,
        @Query("include_image_language") includeImageLanguage: String = "en"
    ): TMDBTvShowDto

    @GET("tv/{id}/season/{season_number}")
    suspend fun getSeason(
        @Path("id") id: Int,
        @Path("season_number") seasonNumber: Int,
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "en-US",
    ): TMDBSeasonDto

    @GET("trending/{media_type}/{time_window}")
    suspend fun getTrending(
        @Path("media_type") mediaType: String, // others: movie, tv
        @Path("time_window") timeWindow: String, // others: day
        @Query("api_key") apiKey: String,
        @Query("page") page: Int,
        @Query("region") region: String = "US",
    ): TMDBPageResponse<TMDBSearchItem>

    @GET("discover/{media_type}")
    suspend fun discoverFilms(
        @Path("media_type") mediaType: String, // movie, tv
        @Query("api_key") apiKey: String,
        @Query("page") page: Int,
        @Query("vote_count.gte") minVoteCount: String = "300",
        @Query("sort_by") sortBy: String = "vote_average.desc",
        @Query("with_genres") genres: String = "",
        @Query("with_companies") companies: String = "",
        @Query("with_networks") networks: String = "",
        @Query("watch_region") watchRegion: String = "US",
        @Query("release_date.lte") releasedDate: String = when(Build.VERSION.SDK_INT) {
            Build.VERSION_CODES.O -> LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            else -> SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        },
        @Query("with_original_language") withOriginalLanguage: String = "en",
    ): TMDBPageResponse<TMDBSearchItem>

    @GET("genre/{media_type}/list")
    suspend fun getGenres(
        @Path("media_type") mediaType: String, // movie, tv
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "en-US"
    ): TMDBGenresDto

    @GET("search/{media_type}")
    suspend fun search(
        @Path("media_type") mediaType: String, // movie, tv, multi
        @Query("api_key") apiKey: String,
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("language") language: String = "en-US",
        @Query("include_adult") includeAdult: Boolean = false,
        @Query("region") region: String = "US"
    ): TMDBPageResponse<TMDBSearchItem>


    @GET("{media_type}/{id}/images")
    suspend fun getImages(
        @Path("media_type") mediaType: String, // movie, tv,
        @Path("id") id: Int,
        @Query("api_key") apiKey: String,
        @Query("include_image_language") includeImageLanguage: String = "en"
    ): TMDBImagesResponseDto
}