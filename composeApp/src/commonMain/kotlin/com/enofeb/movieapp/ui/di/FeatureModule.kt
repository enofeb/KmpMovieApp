package com.enofeb.movieapp.ui.di

import com.enofeb.movieapp.ui.home.HomeViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val featureModule: Module = module {
    viewModelOf(::HomeViewModel)
}