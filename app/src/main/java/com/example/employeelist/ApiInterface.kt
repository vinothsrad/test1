package com.example.employeelist

import android.telecom.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/users")
    fun getDate(): retrofit2.Call<List<UserDetailsItem>>
}