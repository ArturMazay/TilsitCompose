package com.crimsoftltd.tilsitcompose.datasource

import com.crimsoftltd.tilsitcompose.domain.Model

interface ILoadFirebaseData {
    suspend fun loadDataFb() : List<Model>
}