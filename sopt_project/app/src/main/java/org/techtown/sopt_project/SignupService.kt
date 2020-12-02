package org.techtown.sopt_project

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface SignupService {
    @Headers("Content-Type: application/json")
    @POST("/users/signup")
    fun postSignup(
        @Body body : SignupRequestData
    ) : Call<SignupResponseData>
}