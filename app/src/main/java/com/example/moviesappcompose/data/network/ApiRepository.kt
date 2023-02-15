package com.example.moviesappcompose.data.network

import java.util.concurrent.AbstractExecutorService
import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getAllMovies() = apiService.getAllMovies()
}