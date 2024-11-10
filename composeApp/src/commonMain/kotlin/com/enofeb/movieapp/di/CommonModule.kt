package com.enofeb.movieapp.di

import com.enofeb.movieapp.data.di.dataModule
import com.enofeb.movieapp.domain.di.domainModule
import com.enofeb.movieapp.ui.di.featureModule

val commonModules = listOf(dataModule, domainModule, featureModule)