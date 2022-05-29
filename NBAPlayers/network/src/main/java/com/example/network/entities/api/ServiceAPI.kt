package com.example.network.entities.api

import com.example.network.entities.models.PlayersDTO
import retrofit2.Call
import retrofit2.http.GET

interface ServiceAPI {
    @GET("players")
    fun getPlayers(): Call<PlayersDTO>
}