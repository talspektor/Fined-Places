package com.talspektor.finedplaces.networking

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//retrofit object -> singleton
class RetrofitInstance {

    companion object {
        const val BASE_URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/"
    }

    private val interceptor : HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = HttpLoggingInterceptor.Level.BODY
    }

    private val client : OkHttpClient = OkHttpClient.Builder().apply {
        this.addInterceptor(interceptor)
    }.build()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

//    val retrofit = Retrofit.Builder() //define retrofit
//        .baseUrl(BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//
//    private  object HOLDER {
//        val INSTANCE = RetrofitInstance()
//    }
//
//    companion object {
//        val instance: RetrofitInstance by lazy {  HOLDER.INSTANCE }
//    }
}