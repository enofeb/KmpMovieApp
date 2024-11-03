package com.enofeb.movieapp

import android.app.Application
import com.enofeb.movieapp.di.commonModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieApp)
            modules(commonModules)
        }
    }
}