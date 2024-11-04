package com.enofeb.movieapp.domain.usecase

import com.enofeb.movieapp.data.holder.Result
import com.enofeb.movieapp.data.repo.MovieRepository
import com.enofeb.movieapp.domain.entity.MoviePopular
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetPopularMoviesUseCase(private val movieRepository: MovieRepository) {

    fun getPopularMovies(page: Int): Flow<Result<MoviePopular>> {
        return movieRepository.fetchPopularMovies(page).map { result ->
            when (result) {
                is Result.Success -> {
                    Result.Success(MoviePopular(result.data.page ?: 0))
                }

                is Result.Error -> {
                    Result.Error(result.exception)
                }

                is Result.Loading -> {
                    Result.Loading
                }
            }
        }
    }
}