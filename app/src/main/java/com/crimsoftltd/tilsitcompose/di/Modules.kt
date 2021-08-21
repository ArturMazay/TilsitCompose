package com.crimsoftltd.tilsitcompose.di

import com.crimsoftltd.tilsitcompose.datasource.ILoadFirebaseData
import com.crimsoftltd.tilsitcompose.datasource.RepositoryFirebase
import com.crimsoftltd.tilsitcompose.domain.GetDataImp
import com.crimsoftltd.tilsitcompose.domain.IGetData
import com.crimsoftltd.tilsitcompose.ui.theme.TitleViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val data = module {
    single<ILoadFirebaseData> { RepositoryFirebase() }
}
val domain = module {
    single <IGetData>{ GetDataImp(repositoryFirebase = get()) }
    viewModel { TitleViewModel(useCase = get()) }
}