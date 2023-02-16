package com.example.moviesappcompose.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.moviesappcompose.MainViewModel
import com.example.moviesappcompose.screens.DetailScreen
import com.example.moviesappcompose.screens.MainScreen
import com.example.moviesappcompose.screens.SplashScreen
import com.example.moviesappcompose.utils.Constans

sealed class Screens(val route: String) {
    object Splash : Screens(route = Constans.Screens.SPLASH_SCREEN)
    object Main : Screens(route = Constans.Screens.MAIN_SCREEN)
    object Detail : Screens(route = Constans.Screens.DETAILS_SCREEN)

}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel) {

    NavHost(navController = navController, startDestination = Screens.Splash.route) {
        composable(route = Screens.Splash.route) {
            SplashScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = Screens.Main.route) {
            MainScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = Screens.Detail.route + "/{Id}") { backStackEntry ->
            DetailScreen(
                viewModel = viewModel,
                itemId = backStackEntry.arguments?.getString("Id") ?: "1"
            )
        }
    }

}