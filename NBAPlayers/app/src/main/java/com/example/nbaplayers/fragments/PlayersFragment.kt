package com.example.nbaplayers.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.nbaplayers.R
import com.example.nbaplayers.adapter.RecyclerAdapter
import com.example.nbaplayers.databinding.FragmentPlayersBinding
import com.example.nbaplayers.viewmodels.PlayersViewModel
import com.example.network.entities.models.PlayersDTO

class PlayersFragment : Fragment() {

    private lateinit var binding: FragmentPlayersBinding

    //Players ViewModel
    private lateinit var playersViewModel: PlayersViewModel

    //RecyclerAdapter
    private lateinit var adapter: RecyclerAdapter

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
        getAdapter()

        //ViewModel observation
        playersViewModel.playersDTO.observe(viewLifecycleOwner) { playersList ->
            adapter.updateCollectionsData(playersList)
        }
        playersViewModel.getPlayersDataRequest()
    }

    private fun getAdapter() {
        adapter = RecyclerAdapter()
        adapter.setOnItemClickListener(object : RecyclerAdapter.OnClickCallback {
            override fun onItemClick(playersData: PlayersDTO.Data) {
                requireActivity().supportFragmentManager.beginTransaction().apply {
                    val detailsFragment = PlayersDetailsFragment().also { detailsFragment ->
                        val bundle = Bundle()
                        bundle.putInt(ID_STRING, playersData.ikeAnigbogu.id)
                        detailsFragment.arguments = bundle
                    }
                    replace(R.id.fragmentContainerView, detailsFragment)
                    addToBackStack(PlayersDetailsFragment::class.java.name)
                    commit()
                }
            }

        })

        binding.recyclerView.adapter = adapter
    }

    companion object {
        const val ID_STRING = "id"
    }
}