package com.github.elfed108.actofpresence.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@SuppressLint("ConflictingOnColor")
private val LightColorPalette = lightColors(

    primary = GreenButton, //цвет лого и активной кнопки в bottomBar
    primaryVariant = lightGreenSurface,  // цвет подложки LazyColumn
    secondary = GreenButton,// lazyRow цвет подложк и
    secondaryVariant = Grey700,//цвет неактивной кнопки

    background = Color.White,// основной фон, цвет иконок LazyRow
    surface = lightGreenSurface, //фон LazyColumn
    onPrimary = Black, //цвет текста на фоне
    onSecondary = GreyText, // серый текст описания lazyColumn и вопроса в Greeting
    onBackground = GreyText,// Цвет заголовка Column
    onSurface = GreenButton, //цвет кнопки
)

@SuppressLint("ConflictingOnColor")
private val DarkColorPalette = darkColors(
    primary = TextWhite, //цвет лого и активной кнопки в bottomBar
    primaryVariant = TextWhite,// цвет подложки LazyColumn
    secondary = TextWhite,// lazyRow цвет подложки
    secondaryVariant = Grey600,//цвет неактивной кнопки

    background = GreenDark800,// основной фон, цвет иконок LazyRow
    surface = WhiteDark800,//фон LazyColumn
    onPrimary = TextWhite, //цвет текста на фоне
    onSecondary = GreyText,// серый текст описания lazyColumn и вопроса в Greeting
    onBackground = TextWhite,// Цвет заголовка Column
    onSurface = GreenDark800,//цвет кнопки
)

@Composable
fun ActOfPresenceTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = if (darkTheme) GreenDark800 else TextWhite
        )
        systemUiController.setNavigationBarColor(
            color = Black
        )
    }

    MaterialTheme(
        colors = colors,
        typography = ActOfPresenceTypography,
        shapes = ActOfPresenceShapes,
        content = content
    )
}
