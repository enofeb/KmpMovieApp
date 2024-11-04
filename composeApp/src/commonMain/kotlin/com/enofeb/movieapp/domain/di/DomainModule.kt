package com.enofeb.movieapp.domain.di

import com.enofeb.movieapp.domain.usecase.GetPopularMoviesUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val domainModule: Module = module {
    single { GetPopularMoviesUseCase(get()) }
}