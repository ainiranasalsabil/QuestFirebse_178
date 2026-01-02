package com.example.pertemuan14.repositori

import com.example.pertemuan14.modeldata.Siswa
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
}

class FirebaseRepositorySiswa : RepositorySiswa {


}