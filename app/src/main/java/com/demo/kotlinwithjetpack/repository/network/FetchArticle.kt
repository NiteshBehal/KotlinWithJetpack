package com.demo.kotlinwithjetpack.repository.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FetchArticle {

    @GET("top-headlines")
    fun getArticles(
        @Query("country") country: String?,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
        @Query("apiKey") apiKey: String?
    ): Call<ArticleModel>?
}