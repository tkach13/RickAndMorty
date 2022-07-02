package com.benten.rickandmorty.models


import com.google.gson.annotations.SerializedName

data class RickAndMortyCharactersResponse(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val characters: List<Character>
)