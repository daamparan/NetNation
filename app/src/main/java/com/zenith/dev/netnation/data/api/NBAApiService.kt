package com.zenith.dev.netnation.data.api

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import com.zenith.dev.netnation.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

private const val BASE_URL = BuildConfig.SPORTS_API_URL
private const val authHeaderName = "x-rapidapi-key"
private const val hostHeaderName = BuildConfig.HOST

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NBAApiService {
    @GET("players")
    suspend fun getPlayers(
        @Header(authHeaderName) authHeaderValue: String,
        @Header(hostHeaderName) hostHeaderValue: String,
        @Query("season") seasonValue: String,
        @Query("team") teamValue: String
    ): String

    @GET("")
}