package com.example.testusingdagger.di.module

import com.example.testusingdagger.ui.screen.FirstFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeImagesListFragment(): FirstFragment
}