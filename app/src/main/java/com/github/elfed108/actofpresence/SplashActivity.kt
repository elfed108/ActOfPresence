package com.github.elfed108.actofpresence

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.elfed108.actofpresence.ui.LogoIcons
import com.github.elfed108.actofpresence.ui.theme.ActOfPresenceTheme
import com.github.elfed108.actofpresence.ui.theme.GreenDark800

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActOfPresenceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    contentColor = GreenDark800,
                ) {
                    Splash()
                }
            }
        }
    }
}

@Composable
fun Splash() {
    Image(
        painter = painterResource(id = R.drawable.background_welcome),
        contentDescription = null,
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
    )
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .wrapContentHeight(CenterVertically)
            .fillMaxWidth()
            .wrapContentWidth(CenterHorizontally)
    ) {
        LogoIcons(size = 102.dp)
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SplashPreview() {
    ActOfPresenceTheme {
        Surface(
            color = MaterialTheme.colors.background,
            contentColor = GreenDark800,
        ) {
            Splash()
        }
    }
}