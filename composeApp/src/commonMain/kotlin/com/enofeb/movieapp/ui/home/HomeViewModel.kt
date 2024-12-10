package com.enofeb.movieapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enofeb.movieapp.data.holder.Result
import com.enofeb.movieapp.domain.entity.MoviePopular
import com.enofeb.movieapp.domain.usecase.GetPopularMoviesUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class HomeViewModel(private val getPopularMoviesUseCase: GetPopularMoviesUseCase) : ViewModel() {

    private val _movieList: MutableStateFlow<List<MoviePopular>> = MutableStateFlow(listOf())
    val movieList: StateFlow<List<MoviePopular>> = _movieList.asStateFlow()

    init {
        getPopularMovies()
    }

    private fun getPopularMovies() {
        viewModelScope.launch {
            getPopularMoviesUseCase.getPopularMovies(1).onEach { result ->
                // state will be here
                if (result is Result.Success) {
                    _movieList.value = result.data
                }
            }.collect()
        }
    }
}