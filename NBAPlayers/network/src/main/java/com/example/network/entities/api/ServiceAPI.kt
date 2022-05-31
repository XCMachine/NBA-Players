package com.example.network.entities.api

import com.example.network.entities.models.PlayersDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceAPI {
    @GET("players")
    fun getPlayers(): Call<PlayersDTO>

    @GET("players/{id}")
    fun getPlayersId(
        @Path("id") id: Int
    ): Call<PlayersDTO>
}