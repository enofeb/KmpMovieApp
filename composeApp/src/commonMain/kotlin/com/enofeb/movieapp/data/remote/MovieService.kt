package com.enofeb.movieapp.data.remote

import com.enofeb.movieapp.data.model.MovieResponse

interface MovieService {

    suspend fun getPopularMovies(page: Int): MovieResponse
}