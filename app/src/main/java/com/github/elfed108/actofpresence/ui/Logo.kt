package com.github.elfed108.actofpresence.ui

import android.view.View
import android.view.Window
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.github.elfed108.actofpresence.R
import com.github.elfed108.actofpresence.ui.theme.WhiteDark800

@Composable
fun LogoIcons(
    size: Dp = 24.dp,
    tint: Color = WhiteDark800
) {
    Icon(
        painter = painterResource(id = R.drawable.ic_scan),
        contentDescription = stringResource(id = R.string.scan),
        modifier = Modifier.size(size + size * 0.1f),
        tint = tint
    )
    Icon(
        painter = painterResource(id = R.drawable.ic_non_action),
        contentDescription = stringResource(id = R.string.non_action),
        modifier = Modifier.size(size),
        tint = tint
    )
    Icon(
        painter = painterResource(id = R.drawable.ic_cultivation),
        contentDescription = stringResource(id = R.string.cultivation),
        modifier = Modifier.size(size),
        tint = tint
    )
}