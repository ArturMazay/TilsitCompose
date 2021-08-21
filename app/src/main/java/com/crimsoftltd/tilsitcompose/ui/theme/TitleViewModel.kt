package com.crimsoftltd.tilsitcompose.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.crimsoftltd.tilsitcompose.domain.IGetData
import kotlinx.coroutines.Dispatchers

class TitleViewModel(private val useCase: IGetData) : ViewModel() {


    val loadDataList = liveData(Dispatchers.IO) {
        try {
            val modelList = useCase.getData()
            emit(modelList)

        } catch (e: Exception) {
            //emit(Status.Failure(e))
        }

    }

}