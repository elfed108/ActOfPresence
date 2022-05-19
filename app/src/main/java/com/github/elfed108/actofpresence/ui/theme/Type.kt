package com.github.elfed108.actofpresence.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import androidx.compose.ui.text.font.Font
import com.github.elfed108.actofpresence.R

// Set of Material typography styles to start with
private val AlegreyaSans = FontFamily(
    Font(R.font.alegreya_sans_regular),
    Font(R.font.alegreya_sans_medium, FontWeight.W500),
    Font(R.font.alegreya_sans_bold, FontWeight.W600)
)

/**
 * https://fonts.google.com/specimen/Domine
 */
private val Alegreya = FontFamily(
    Font(R.font.alegreya_regular),
    Font(R.font.alegreya_bold, FontWeight.Bold)
)

val ActOfPresenceTypography = Typography(
    h4 = TextStyle(
        fontFamily = Alegreya,
       // fontWeight = FontWeight.W700,
        fontSize = 30.sp,
        color = TextWhite
    ),
    h5 = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp,
        color = TextWhite
    ),
    h6 = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        color = TextWhite
    ),
    subtitle1 = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp,
        color = WhiteDark800
    ),
    subtitle2 = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        color = WhiteDark800
    ),
    body1 = TextStyle(
        fontFamily = Alegreya,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = WhiteDark800
    ),
    body2 = TextStyle(
        fontFamily = AlegreyaSans,
        fontSize = 14.sp,
        color = WhiteDark800
    ),
    button = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp,
        color = WhiteDark800
    ),
    caption = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        color = WhiteDark800
    ),
    overline = TextStyle(
        fontFamily = AlegreyaSans,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp,
        color = WhiteDark800
    )
)