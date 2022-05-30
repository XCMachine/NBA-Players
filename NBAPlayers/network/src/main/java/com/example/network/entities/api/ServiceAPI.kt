package com.example.network.entities.api

import com.example.network.entities.models.PlayersDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceAPI {
    @GET("players/{id}")
    fun getPlayers(
        @Path("id") id: Int
    ): Call<List<PlayersDTO.Data>>
}