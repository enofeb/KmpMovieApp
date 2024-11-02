package com.enofeb.movieapp.data

import com.enofeb.movieapp.data.model.MovieResponse

interface MovieApi {

    suspend fun getPopularMovies(page: Int): MovieResponse
}