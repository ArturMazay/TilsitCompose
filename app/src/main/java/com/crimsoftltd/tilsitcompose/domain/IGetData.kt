package com.crimsoftltd.tilsitcompose.domain

interface IGetData {
    suspend fun getData():List<Model>
}