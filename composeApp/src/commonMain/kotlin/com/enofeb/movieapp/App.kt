package com.enofeb.movieapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.enofeb.movieapp.ui.MainScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        MainScreen()
    }
}