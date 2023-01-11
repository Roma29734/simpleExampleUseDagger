package com.example.testusingdagger.di.module

import dagger.Module


@Module(
    includes = [
        ViewModelModule::class,
        DataModule::class
    ]
)
class AppModule