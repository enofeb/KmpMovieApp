package com.enofeb.movieapp.data.remote

import com.enofeb.movieapp.data.model.MovieResultResponse

interface MovieService {

    suspend fun fetchPopularMovies(page: Int): MovieResultResponse
}