package com.enofeb.movieapp.ui


import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.enofeb.movieapp.ui.component.MovieBottomAppBar
import com.enofeb.movieapp.ui.navigation.Destinations

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            MovieBottomAppBar(navController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Destinations.Home,
            modifier = Modifier.padding(paddingValues = paddingValues)
        ) {
            composable(Destinations.Home) {
                HomeScreen()
            }
            composable(Destinations.Search) {
                SearchScreen()
            }
            composable(Destinations.WatchLater) {
                WatchLaterScreen()
            }
        }
    }
}