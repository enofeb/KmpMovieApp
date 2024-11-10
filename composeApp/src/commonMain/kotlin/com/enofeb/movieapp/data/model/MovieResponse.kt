package com.enofeb.movieapp.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MovieResponse(
    val page: Int?
)
