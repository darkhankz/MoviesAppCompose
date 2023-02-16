package com.example.moviesappcompose.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.moviesappcompose.MainViewModel

@Composable
fun DetailScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text(text = "DetailScreen item id: ${itemId}")
}