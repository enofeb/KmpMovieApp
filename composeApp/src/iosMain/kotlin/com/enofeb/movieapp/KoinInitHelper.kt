package com.enofeb.movieapp

import com.enofeb.movieapp.di.commonModules
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(commonModules)
    }
}