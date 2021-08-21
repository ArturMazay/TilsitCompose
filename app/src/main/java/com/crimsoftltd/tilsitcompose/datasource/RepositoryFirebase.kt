package com.crimsoftltd.tilsitcompose.datasource

import android.util.Log
import com.crimsoftltd.tilsitcompose.domain.Model
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class RepositoryFirebase : ILoadFirebaseData {
    override suspend fun loadDataFb(): List<Model> {
        var mImage: String
        var mTitle: String
        var mDescription: String
        val modelList = mutableListOf<Model>()
        val listResultFb = FirebaseFirestore.getInstance().collection("Tilsit").get().await()
        for (document in listResultFb) {
            mImage = document.getString("image") ?: ""
            mTitle = document.getString("title") ?: ""
            mDescription = document.getString("description") ?: ""
            modelList.add(Model(mTitle, mDescription, mImage))
            Log.i("TAG", mImage)
        }
        return modelList
    }
}