package com.example.testusingdagger.di.module

import com.example.testusingdagger.data.TestRepository
import com.example.testusingdagger.data.TestRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideRepository(impl: TestRepositoryImpl): TestRepository = impl

    @Provides
    fun provideRepositoryImpl(): TestRepositoryImpl = TestRepositoryImpl("mane")
}