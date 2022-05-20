package com.github.elfed108.actofpresence.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = GreenDark800,
    primaryVariant = GreenDark800,
    secondary = WhiteDark800,
    // Other default colors to override
    background = GreenDark800,
    surface = WhiteDark800,
    onPrimary = TextWhite,
    onSecondary = GreenDark800,
    onBackground = TextWhite,
    onSurface = GreenDark800,
)

@Composable
fun ActOfPresenceTheme(content: @Composable () -> Unit) {
    val colors = LightColorPalette
    MaterialTheme(
        colors = colors,
        typography = ActOfPresenceTypography,
        shapes = ActOfPresenceShapes,
        content = content
    )
}