package com.enofeb.movieapp.data.extension

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import com.enofeb.movieapp.data.holder.Result
import kotlinx.coroutines.flow.first

fun <T> Flow<T>.remote(): Flow<Result<T>> {
    return flow {
        try {
            emit(Result.Loading)
            val result = this@remote.first()
            emit(Result.Success(result))
        } catch (e: Exception) {
            emit(Result.Error(e))
        }
    }
}