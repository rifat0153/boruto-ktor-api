package com.rifat.plugins



import com.rifat.di.KoinModule
import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.logger.slf4jLogger


fun Application.configureKoin () {
    install(Koin) {
        slf4jLogger(level = org.koin.core.logger.Level.ERROR)
        modules(KoinModule)
    }
}