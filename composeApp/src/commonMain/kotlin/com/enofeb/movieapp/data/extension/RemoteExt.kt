package com.enofeb.movieapp.data.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import com.enofeb.movieapp.data.holder.Result
import io.github.aakira.napier.Napier
import kotlinx.coroutines.flow.first

fun <T> Flow<T>.remote(): Flow<Result<T>> {
    return flow {
        try {
            emit(Result.Loading)
            val result = this@remote.first()
            emit(Result.Success(result))
            Napier.d(tag = "HTTP RESPONSE", message = result.toString())
        } catch (exception: Exception) {
            emit(Result.Error(exception))
            Napier.e(
                tag = "HTTP REQUEST ERROR",
                message = exception.toString(),
                throwable = exception
            )
        }
    }
}