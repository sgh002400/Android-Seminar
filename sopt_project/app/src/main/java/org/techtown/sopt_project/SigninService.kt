package org.techtown.sopt_project

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface SigninService {
    @Headers("Content-Type: application/json")
    @POST("/users/signin")
    fun postSignin(
        @Body body : SigninRequestData
    ) : Call<SigninResponseData>
}