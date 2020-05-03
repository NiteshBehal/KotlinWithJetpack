package com.demo.kotlinwithjetpack.repository.network

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiHelper(context: Context) {


    val BASE_URL = "https://newsapi.org/v2/"
    val API_KEY = "4e02fcfa306546ba9556850eb654e723"
    var apiService: FetchArticle? = null

    init {
        val cache = Cache(context.applicationContext.cacheDir, 1024 * 10 * 10)
        val okHttpClient = OkHttpClient.Builder()
            .cache(cache)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiService = retrofit.create(FetchArticle::class.java)
    }

    fun getArticles(pageNo: Int): Call<ArticleModel>? {
        return apiService?.getArticles("in", 10, pageNo, API_KEY)
    }
}