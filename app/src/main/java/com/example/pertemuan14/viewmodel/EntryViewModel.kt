package com.example.pertemuan14.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pertemuan14.modeldata.DetailSiswa
import com.example.pertemuan14.modeldata.UIStateSiswa
import com.example.pertemuan14.modeldata.toDataSiswa
import com.example.pertemuan14.repositori.RepositorySiswa

class EntryViewModel(
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    /* Fungsi untuk memvalidasi input */
    private fun validasiInput(
        uiState: DetailSiswa = uiStateSiswa.detailSiswa
    ):