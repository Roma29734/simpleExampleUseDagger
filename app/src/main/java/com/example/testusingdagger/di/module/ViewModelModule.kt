package com.example.testusingdagger.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testusingdagger.ui.screen.FirstViewModel
import com.example.testusingdagger.ui.viewModel.ViewModelFactory
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    abstract fun bindImagesListViewModel(imagesListViewModel: FirstViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)