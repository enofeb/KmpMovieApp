package com.enofeb.movieapp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val LightColorScheme = lightColorScheme(
    primary = PrimaryDark,
    primaryContainer = PrimaryDark,
    onPrimaryContainer = LightGrey,
    background = Color.White,
    onSurface = Color.Black,
    surface = Color.White,
    secondary = PrimaryDark,
    secondaryContainer = LightGrey,
    onPrimary = Color.Black,
    onSecondary = Color.White,
    onBackground = Color.Black,
    surfaceVariant = LightBackground,
    tertiary = Blue,
    onTertiary = Color.LightGray,
    onTertiaryContainer = Color.Black,
    surfaceContainer = Color.Black,
    surfaceContainerHigh = LightGrey
)

val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    secondary = PrimaryDark,
    background = DarkBackground,
    surface = DarkContentBackground,
    surfaceVariant = DarkContentBackground,
    onPrimary = Color.White,
    onSecondary = Color.White,
    secondaryContainer = DarkGrey,
    onBackground = Color.Black,
    onSurface = Color.White,
    tertiary = Blue,
    onTertiary = DarkGrey,
    onTertiaryContainer = Blue,
    surfaceContainer = DarkGrey,
    surfaceContainerHigh = DarkContentBackground
)

@Composable
fun MovieTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(colorScheme = colorScheme, content = content, typography = MovieTypography())
}