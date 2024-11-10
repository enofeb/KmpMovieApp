package com.enofeb.movieapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.enofeb.movieapp.domain.usecase.GetPopularMoviesUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class HomeViewModel(private val getPopularMoviesUseCase: GetPopularMoviesUseCase) : ViewModel() {

    init {
        getPopularMovies()
    }

    private fun getPopularMovies() {
        viewModelScope.launch {
            getPopularMoviesUseCase.getPopularMovies(1).onEach {
                // state will be here
            }.collect()
        }
    }
}