package com.benten.rickandmorty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.benten.rickandmorty.apis.RickAndMortyApi
import com.benten.rickandmorty.databinding.ActivityMainBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rickAndMortyApi = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMortyApi::class.java)




    }

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/api"
    }
}