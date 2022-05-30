package com.example.network.entities.datasources

import android.util.Log
import com.example.network.Retrofit
import com.example.network.entities.api.ServiceAPI
import com.example.network.entities.models.PlayersDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlayersRemoteDatasource(
    private val serviceAPI: ServiceAPI = Retrofit().getInstance().create(ServiceAPI::class.java)
) {
    fun getPlayersData(
        callback: DataCallback,
        id: Int
    ) {
        val callPlayers = serviceAPI.getPlayers(id)
        callPlayers.enqueue(object : Callback<List<PlayersDTO.Data>> {
            override fun onResponse(
                call: Call<List<PlayersDTO.Data>>,
                response: Response<List<PlayersDTO.Data>>
            ) {
                response.body()?.run {
                    callback.onDataReady(this)
                }
            }

            override fun onFailure(call: Call<List<PlayersDTO.Data>>, t: Throwable) {
                Log.e("Error", t.localizedMessage!!)
            }
        })
    }

    interface DataCallback {
        fun onDataReady(data: List<PlayersDTO.Data>)
    }
}