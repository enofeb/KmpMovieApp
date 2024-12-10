package com.enofeb.movieapp.data.repo

import com.enofeb.movieapp.data.extension.remote
import com.enofeb.movieapp.data.holder.Result
import com.enofeb.movieapp.data.model.MovieResultResponse
import com.enofeb.movieapp.data.remote.MovieService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MovieRepository(private val movieService: MovieService) {

    fun fetchPopularMovies(page: Int): Flow<Result<MovieResultResponse>> {
        return flow {
            emit(
                movieService.fetchPopularMovies(page)
            )
        }.remote()
    }
}