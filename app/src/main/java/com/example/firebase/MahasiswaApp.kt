package com.example.firebase

import android.app.Application
import com.example.firebase.di.AppContainer
import com.example.firebase.di.MahasiswaContainer

class MahasiswaApplication: Application() {
    lateinit var container: MahasiswaContainer
    override fun onCreate() {
        super.onCreate()
        container= MahasiswaContainer()
    }
}