package com.example.firebase.model

data class Mahasiswa (
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenisKelamin: String,
    val kelas: String,
    val angkatan: String,
    val skripsi: String,
    val dospem1: String,
    val dospem2: String
){
    constructor(): this("", "", "", "", "", "","","","")
}