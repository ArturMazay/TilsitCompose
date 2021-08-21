package com.crimsoftltd.tilsitcompose.domain

import com.crimsoftltd.tilsitcompose.datasource.ILoadFirebaseData

class GetDataImp (private val repositoryFirebase: ILoadFirebaseData):IGetData  {
    override suspend fun getData(): List<Model> = repositoryFirebase.loadDataFb()

}