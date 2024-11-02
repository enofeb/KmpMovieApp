package com.enofeb.movieapp.data

import com.enofeb.movieapp.data.model.MovieResponse
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.encodedPath

class MovieApiImpl : MovieApi {

    override suspend fun getPopularMovies(page: Int): MovieResponse {
        return client.get {
            url {
                encodedPath = "3/movie/popular"
                parameters.append("page", page.toString())
            }
        }.body()
    }
}