package com.example.nbaplayers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.nbaplayers.R
import com.example.nbaplayers.databinding.FragmentPlayersBinding
import com.example.nbaplayers.viewmodels.PlayersViewModel

class PlayersFragment : Fragment() {

    private lateinit var binding: FragmentPlayersBinding

    //Players ViewModel
    private lateinit var playersViewModel: PlayersViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        playersViewModel = ViewModelProvider(this).get(PlayersViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //ViewModel observation
        playersViewModel.playersDTO.observe(viewLifecycleOwner) {
            //This does not work and will be remade in the next branch
            //playersViewModel.getPlayersDataRequest()
        }
    }
}