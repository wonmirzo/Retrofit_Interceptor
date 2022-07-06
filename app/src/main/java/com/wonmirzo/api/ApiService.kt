package com.wonmirzo.api

import com.wonmirzo.model.ResponseItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

@JvmSuppressWildcards
interface ApiService {

    @GET("photos")
    fun getPhotos(): Call<List<ResponseItem>>

    @GET("photos/{id}")
    fun getPhoto(@Path("id") id: String): Call<ResponseItem>

    @GET("collections/{id}/related")
    fun getRelatedCollections(@Path("id") id: String): Call<ResponseItem>
}