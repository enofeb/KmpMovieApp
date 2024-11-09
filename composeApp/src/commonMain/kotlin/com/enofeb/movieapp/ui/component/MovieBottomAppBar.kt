package com.enofeb.movieapp.ui.component

import androidx.compose.material.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import movieappkmm.composeapp.generated.resources.Res
import androidx.navigation.compose.currentBackStackEntryAsState
import com.enofeb.movieapp.ui.navigation.Destinations
import movieappkmm.composeapp.generated.resources.ic_bookmark
import movieappkmm.composeapp.generated.resources.ic_home
import movieappkmm.composeapp.generated.resources.ic_search

@Composable
fun MovieBottomAppBar(navController: NavController) {
    BottomAppBar {

        val backStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry.value?.destination?.route

        NavigationBarItem(
            icon = Res.drawable.ic_home,
            label = "Home",
            onClick = {
                if (currentRoute != Destinations.Home) {
                    navController.navigate(Destinations.Home)
                }
            },
            selected = currentRoute == Destinations.Home
        )
        NavigationBarItem(
            icon = Res.drawable.ic_search,
            label = "Search",
            onClick = {
                if (currentRoute != Destinations.Search) {
                    navController.navigate(Destinations.Search)
                }
            },
            selected = currentRoute == Destinations.Search
        )
        NavigationBarItem(
            icon = Res.drawable.ic_bookmark,
            label = "Watch Later",
            onClick = {
                if (currentRoute != Destinations.WatchLater) {
                    navController.navigate(Destinations.WatchLater)
                }
            },
            selected = currentRoute == Destinations.WatchLater
        )
    }
}