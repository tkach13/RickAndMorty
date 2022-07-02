package com.benten.rickandmorty.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.benten.rickandmorty.databinding.LayoutCharacterItemBinding


class RickAndMortyAdapter() : RecyclerView.Adapter<RickAndMortyAdapter.RickAndMortyViewHolder>() {

    private val itemsList = mutableListOf<String>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAndMortyViewHolder {
        val binding =
            LayoutCharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RickAndMortyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RickAndMortyViewHolder, position: Int) {
    }


    override fun getItemCount(): Int {
        return itemsList.size
    }


    inner class RickAndMortyViewHolder(private val binding: LayoutCharacterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

}