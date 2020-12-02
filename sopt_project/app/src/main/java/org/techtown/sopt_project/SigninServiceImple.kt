package org.techtown.sopt_project

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SigninServiceImple {
    private const val BASE_URL = "http://15.164.83.210:3000"
    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build() //레트로핏 객체 만든거

    val service : SigninService= retrofit.create(SigninService::class.java)
}