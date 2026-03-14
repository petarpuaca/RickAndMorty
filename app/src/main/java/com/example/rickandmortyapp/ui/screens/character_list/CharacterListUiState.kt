package com.example.rickandmortyapp.ui.screens.character_list

import com.example.rickandmortyapp.domain.model.CharacterModel

data class CharacterListUiState(
    val isLoading: Boolean = false,
    val characters: List<CharacterModel> = emptyList(),
    val errorMessage: String? = null
)
