package org.techtown.sopt_project

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SignupServiceImpl {
    private const val BASE_URL = "http://15.164.83.210:3000"
    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service : SignupService= retrofit.create(SignupService::class.java)
}