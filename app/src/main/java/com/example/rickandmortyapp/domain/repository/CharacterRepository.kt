package com.example.rickandmortyapp.domain.repository

import com.example.rickandmortyapp.domain.model.CharacterModel

interface CharacterRepository {
    suspend fun getCharacters(): List<CharacterModel>
    suspend fun getCharacterById(id: Int): CharacterModel
    //suspend mozemo da pozovemo jedino iz korutine ili druge suspend
}