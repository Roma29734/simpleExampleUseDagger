package com.example.testusingdagger.di.module

import com.example.testusingdagger.ui.MainActivity
import com.example.testusingdagger.ui.screen.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(
        modules = [
            FragmentBuildersModule::class
        ]
    )
    abstract fun contributeMainActivity(): MainActivity
}