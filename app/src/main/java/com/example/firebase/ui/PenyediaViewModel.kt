package com.example.firebase.ui


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase.MahasiswaApplication
import com.example.firebase.ui.home.viewmodel.DetailViewModel
import com.example.firebase.ui.home.viewmodel.HomeViewModel
import com.example.firebase.ui.home.viewmodel.InsertViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(mahasiswaApp().container.repositoryMhs) }
        initializer { InsertViewModel(mahasiswaApp().container.repositoryMhs) }
        initializer { DetailViewModel(mahasiswaApp().container.repositoryMhs) }
    }
}

fun CreationExtras.mahasiswaApp(): MahasiswaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplication)