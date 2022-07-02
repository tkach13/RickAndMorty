package com.benten.rickandmorty.apis

import com.benten.rickandmorty.models.RickAndMortyCharactersResponse
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    suspend fun getAllCharacters(): RickAndMortyCharactersResponse
}