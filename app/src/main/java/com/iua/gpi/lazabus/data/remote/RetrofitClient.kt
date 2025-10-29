package com.iua.gpi.lazabus.data.remote

import com.iua.gpi.lazabus.BuildConfig
import com.iua.gpi.lazabus.data.remote.service.ParadaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.getValue



object RetrofitClient {

    private const val BASE_URL = BuildConfig.API_BASE_URL

    // Configuración base de Retrofit
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val paradaService: ParadaService by lazy {
        retrofit.create(ParadaService::class.java)
    }
}