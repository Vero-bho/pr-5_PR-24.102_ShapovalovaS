package com.example.pr_5_shapovalovas.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

val FitnessOrange = Color(0xFFEB5E28)
val FitnessDark = Color(0xFF403D39)
val FitnessLight = Color(0xFFFFFCF2)

val LightColorScheme = lightColorScheme(
    primary = FitnessOrange,
    secondary = FitnessDark,
    tertiary = FitnessDark,
    background = FitnessLight,
    surface = FitnessLight,
    onPrimary = FitnessLight,
    onSecondary = FitnessLight,
    onBackground = FitnessDark,
    onSurface = FitnessDark
)

val DarkColorScheme = darkColorScheme(
    primary = FitnessOrange,
    secondary = FitnessOrange,
    tertiary = FitnessLight,
    background = FitnessDark,
    surface = FitnessDark,
    onPrimary = FitnessDark,
    onSecondary = FitnessDark,
    onBackground = FitnessLight,
    onSurface = FitnessLight
)

@Composable
fun Pr5_ShapovalovaSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}