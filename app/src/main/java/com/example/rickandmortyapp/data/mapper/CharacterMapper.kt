package com.example.rickandmortyapp.data.mapper

import com.example.rickandmortyapp.data.remote.dto.CharacterDto
import com.example.rickandmortyapp.domain.model.CharacterModel
fun CharacterDto.toDomain(): CharacterModel {
    return CharacterModel(
        id = id,
        name = name,
        status = status,
        species = species,
        gender = gender,
        image = image
    )}