package com.enofeb.movieapp.domain.usecase

import com.enofeb.movieapp.data.holder.Result
import com.enofeb.movieapp.data.repo.MovieRepository
import com.enofeb.movieapp.domain.entity.MoviePopular
import com.enofeb.movieapp.domain.utils.ImageUrl
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetPopularMoviesUseCase(private val movieRepository: MovieRepository) {

    fun getPopularMovies(page: Int): Flow<Result<List<MoviePopular>>> {
        return movieRepository.fetchPopularMovies(page).map { result ->
            when (result) {
                is Result.Success -> {
                    val response = result.data
                    val popularMovie = response.results.map { movie ->
                        MoviePopular(
                            id = movie.id,
                            title = movie.title,
                            imageUrl = ImageUrl.BASE_URL + movie.posterPath,
                            rating = movie.voteAverage.toString()
                        )
                    }
                    Result.Success(popularMovie)
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