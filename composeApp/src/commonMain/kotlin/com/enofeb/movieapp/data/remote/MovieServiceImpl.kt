package com.enofeb.movieapp.data.remote

import com.enofeb.movieapp.data.client.client
import com.enofeb.movieapp.data.model.MovieResponse
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.encodedPath

class MovieServiceImpl : MovieService {

    override suspend fun fetchPopularMovies(page: Int): MovieResponse {
        return client.get {
            url {
                encodedPath = "3/movie/popular"
                parameters.append("page", page.toString())
            }
        }.body()
    }
}