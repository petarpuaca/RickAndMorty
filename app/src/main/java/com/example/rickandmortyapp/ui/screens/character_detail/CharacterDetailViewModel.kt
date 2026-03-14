package com.example.rickandmortyapp.ui.screens.character_detail


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapp.domain.repository.CharacterRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CharacterDetailViewModel(
    private val repository: CharacterRepository,
    private val characterId: Int
) : ViewModel() {

    private val _uiState = MutableStateFlow(CharacterDetailUiState(isLoading = true))
    val uiState: StateFlow<CharacterDetailUiState> = _uiState.asStateFlow()

    init {
        loadCharacter()
    }

    fun loadCharacter() {
        viewModelScope.launch {
            _uiState.value = CharacterDetailUiState(isLoading = true)

            try {
                delay(2000)
//                throw Exception("Test error while loading characters")
                val character = repository.getCharacterById(characterId)
                _uiState.value = CharacterDetailUiState(
                    isLoading = false,
                    character = character
                )
            } catch (e: Exception) {
                _uiState.value = CharacterDetailUiState(
                    isLoading = false,
                    errorMessage = e.message ?: "An unexpected error occurred"
                )
            }
        }
    }
}