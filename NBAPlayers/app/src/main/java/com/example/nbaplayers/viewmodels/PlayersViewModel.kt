package com.example.nbaplayers.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nbaplayers.repositories.PlayersRepository
import com.example.network.entities.models.PlayersDTO

class PlayersViewModel(
    private val playersRepository: PlayersRepository = PlayersRepository
): ViewModel() {
    private val _playersData = MutableLiveData<List<PlayersDTO.Data>>()
    val playersDTO: LiveData<List<PlayersDTO.Data>> = _playersData

    fun getPlayersDataRequest(
        id: Int
    ) {
        playersRepository.getPlayersData(_playersData, id)
    }
}