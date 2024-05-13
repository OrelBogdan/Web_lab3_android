package com.example.android_app.backendapi

import com.example.android_app.models.*
import retrofit2.Call
import retrofit2.http.*

interface DjangoApi {
    @POST("/api/token/")
    fun  getToken(
        @Body info: LogInBody
    ): Call<Token>
}