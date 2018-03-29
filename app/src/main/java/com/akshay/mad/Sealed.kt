package com.akshay.mad

// TODO: 19. Sealed
sealed class Resource<T> {
    data class Success<T>(var data: T) : Resource<T>()
    data class Error<T>(var message: String?) : Resource<T>()
    class Loading<T>() : Resource<T>()
}