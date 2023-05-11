package com.mh.retrofitapiapp

import retrofit2.Response
import retrofit2.http.GET

interface AlbumService {

    // Endpoint of the API
    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>
}