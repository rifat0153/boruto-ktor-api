package com.rifat.di

import com.rifat.repository.HeroRepository
import com.rifat.repository.HeroRepositoryImpl
import org.koin.dsl.module

val KoinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}