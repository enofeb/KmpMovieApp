package com.enofeb.movieapp.di

import com.enofeb.movieapp.data.di.dataModule
import com.enofeb.movieapp.domain.di.domainModule

val commonModules = listOf(dataModule, domainModule)