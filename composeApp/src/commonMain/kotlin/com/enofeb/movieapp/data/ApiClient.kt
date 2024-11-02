package com.enofeb.movieapp.data

import MovieAppKmm.composeApp.BuildConfig
import com.enofeb.movieapp.utils.ApiConstants
import io.ktor.client.HttpClient
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.Logger
import io.ktor.http.takeFrom
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

val client = HttpClient {
    defaultRequest {
        url {
            takeFrom(ApiConstants.BASE_URL)
            parameters.append("api_key", BuildConfig.API_KEY)
        }
    }
    expectSuccess = true
    install(HttpTimeout) {
        val timeout = 30000L
        connectTimeoutMillis = timeout
        requestTimeoutMillis = timeout
        socketTimeoutMillis = timeout
    }
    install(Logging) {
        logger = Logger.DEFAULT
        level = LogLevel.HEADERS
        logger = object : Logger {
            override fun log(message: String) {
                print(message)
            }
        }
    }
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}