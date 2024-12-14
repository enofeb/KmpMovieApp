package com.enofeb.movieapp

import androidx.compose.runtime.*
import com.enofeb.movieapp.theme.MovieTheme
import com.enofeb.movieapp.ui.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MovieTheme {
        MainScreen()
    }
}