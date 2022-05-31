package com.example.nbaplayers.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nbaplayers.R
import com.example.network.entities.models.PlayersDTO

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val playersData: MutableList<PlayersDTO.Data> = mutableListOf()

    private var mListener: OnClickCallback? = null

    interface OnClickCallback {
        fun onItemClick(playersData: PlayersDTO.Data)
    }
    fun setOnItemClickListener(listener: OnClickCallback) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playersData[position])
    }

    override fun getItemCount(): Int = playersData.size

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private var titleText: TextView = itemView.findViewById(R.id.title)

        fun bind(data: PlayersDTO.Data) {
            //This will be empty for now
        }

        init {
            itemView.setOnClickListener {
                mListener?.onItemClick(playersData[adapterPosition])
            }
        }
    }

    fun updateCollectionsData(listItems: List<PlayersDTO.Data>) {
        playersData.clear()
        playersData.addAll(listItems)
        notifyDataSetChanged()
    }
}