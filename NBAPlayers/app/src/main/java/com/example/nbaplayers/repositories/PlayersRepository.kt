package com.example.nbaplayers.repositories

import androidx.lifecycle.MutableLiveData
import com.example.network.entities.datasources.PlayersRemoteDatasource
import com.example.network.entities.models.PlayersDTO
import java.util.Comparator

object PlayersRepository {
    private val playersRemoteDatasource: PlayersRemoteDatasource = PlayersRemoteDatasource()

    //In-memory cache
    private var latestPlayersData: List<PlayersDTO.Data> = listOf()

    fun getPlayersData(
        mutableLiveData: MutableLiveData<List<PlayersDTO.Data>>,
        id: Int
    ) {
        // Check if there is cache data, so it can be carried to the UI, if not to get from the server and override it, before sending it.
        if (latestPlayersData != emptyList<PlayersDTO.Data>()) {
            mutableLiveData.value = latestPlayersData
        } else {
            playersRemoteDatasource.getPlayersData(object : PlayersRemoteDatasource.DataCallback {
                override fun onDataReady(data: List<PlayersDTO.Data>) {
                    latestPlayersData = data
                    mutableLiveData.value = latestPlayersData
                }

            }, id)
        }
    }
}