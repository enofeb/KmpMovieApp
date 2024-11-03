package com.enofeb.movieapp.data.di

import com.enofeb.movieapp.data.remote.MovieService
import com.enofeb.movieapp.data.remote.MovieServiceImpl
import com.enofeb.movieapp.data.repo.MovieRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModule: Module = module {
    single<MovieService> { MovieServiceImpl() }
    single { MovieRepository(get()) }
}