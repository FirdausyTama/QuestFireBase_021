package com.example.firebase.ui.home.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.firebase.repository.RepositoryMhs

class InsertViewModel (
    private val mhs: RepositoryMhs
) : ViewModel() {

}

data class MahasiswaEvent(
    val nim: String = "",
    val nama: String = "",
    val jenisKelamin: String = "",
    val alamat: String = "",
    val kelas: String = "",
    val angkat: String = "",
)