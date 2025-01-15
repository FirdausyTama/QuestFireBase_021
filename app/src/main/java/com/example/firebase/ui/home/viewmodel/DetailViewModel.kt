
package com.example.firebase.ui.home.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase.model.Mahasiswa
import com.example.firebase.repository.RepositoryMhs
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch

class DetailViewModel(
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {

    var detailUiState: DetailUiState by mutableStateOf(DetailUiState.Loading)
        private set

    fun getMhsNim(id: String) {
        viewModelScope.launch {
            repositoryMhs.getMhs(id)
                .onStart {
                    detailUiState = DetailUiState.Loading
                }
                .catch { e ->
                    detailUiState = DetailUiState.Error(e)
                }
                .collect { mahasiswa ->
                    detailUiState = DetailUiState.Success(mahasiswa)
                }

        }
    }
}

sealed class DetailUiState {
    object Loading : DetailUiState()

    data class Success(val data: Mahasiswa) : DetailUiState()

    data class Error(val e: Throwable) : DetailUiState()
}
