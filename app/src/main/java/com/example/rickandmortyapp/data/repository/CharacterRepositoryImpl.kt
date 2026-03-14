package com.example.rickandmortyapp.data.repository

import com.example.rickandmortyapp.data.mapper.toDomain
import com.example.rickandmortyapp.data.remote.RickAndMortyApiService
import com.example.rickandmortyapp.domain.repository.CharacterRepository
import com.example.rickandmortyapp.domain.model.CharacterModel
class CharacterRepositoryImpl(
    private val apiService: RickAndMortyApiService
) : CharacterRepository {

    override suspend fun getCharacters(): List<CharacterModel> {
        return apiService.getCharacters().results.map { characterDto ->
            characterDto.toDomain()
        }
    }

    override suspend fun getCharacterById(id: Int): CharacterModel {
        return apiService.getCharacterById(id).toDomain()
    }
}