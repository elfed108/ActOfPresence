package com.github.elfed108.actofpresence

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.elfed108.actofpresence.data.calmPathList
import com.github.elfed108.actofpresence.data.meditationTypeList
import com.github.elfed108.actofpresence.ui.LogoIcons
import com.github.elfed108.actofpresence.ui.theme.ActOfPresenceTheme
import com.github.elfed108.actofpresence.ui.theme.GreenDark800
import com.github.elfed108.actofpresence.ui.theme.Grey600
import com.github.elfed108.actofpresence.ui.theme.TextWhite

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@Composable
fun HomeScreen() {
    ActOfPresenceTheme {
        Scaffold(
            topBar = { AppBar() },
            bottomBar = { Navigation() },
        ) { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
                    .fillMaxWidth()
            ) {
                Greeting(name = "Виктор")
                TypesMeditationRow()
                PathsMeditationColumn()
            }
        }
    }
}

@Composable
fun AppBar() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(CenterHorizontally)
            ) {
                LogoIcons(size = 36.dp, tint = TextWhite)
            }
        },
        backgroundColor = MaterialTheme.colors.background,
    )
}

@Composable
fun Greeting(name: String) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(bottom = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.hello_name, name),
            style = MaterialTheme.typography.h4,
        )
        Text(
            text = stringResource(R.string.how_are_you_feel),
            style = MaterialTheme.typography.body1,
        )
    }
}

@Composable
fun TypesMeditationRow() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = Modifier.padding(4.dp)
    ) {
        items(meditationTypeList) { item ->
            TypeMeditation(item.drawable, item.text)
        }
    }
}

@Composable
fun TypeMeditation(@DrawableRes icon: Int, @StringRes text: Int) {
    Column(
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier.size(width = 90.dp, height = 110.dp)
    ) {
        Surface(
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.clip(RoundedCornerShape(22.dp)),
            color = TextWhite
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = GreenDark800,
                modifier = Modifier
                    .size(90.dp)
                    .padding(8.dp)
            )
        }
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.subtitle2,
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            )
        )
    }
}

@Composable
fun PathsMeditationColumn() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp),
        modifier = Modifier.padding(4.dp, bottom = 8.dp)
    ) {
        items(calmPathList) { item ->
            MeditationPath(
                image = item.drawable,
                title = item.title,
                description = item.description
            )
        }
    }
}

@Composable
fun MeditationPath(
    @DrawableRes image: Int,
    @StringRes title: Int,
    @StringRes description: Int
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        backgroundColor = TextWhite,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(CenterHorizontally)
            .wrapContentHeight(CenterVertically)
            .padding(horizontal = 16.dp)
    ) {
        Row(
            Modifier
                .padding(start = 16.dp)
                .fillMaxHeight()
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .weight(weight = 1.3f, fill = true)
            ) {
                Text(
                    text = stringResource(id = title),
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.background,
                    modifier = Modifier.paddingFromBaseline(top = 2.dp)
                )
                Text(
                    text = stringResource(id = description),
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.background,
                    maxLines = 3
                )
                val mainButtonColor = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.background,
                    contentColor = MaterialTheme.colors.onBackground
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = { /*TODO*/ },
                    colors = mainButtonColor,
                    contentPadding = PaddingValues(horizontal = 8.dp),
                    modifier = Modifier.padding(bottom = 8.dp)
                ) {
                    Text(
                        text = stringResource(R.string.watch).uppercase(),
                        style = MaterialTheme.typography.button,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxHeight()
                            .wrapContentHeight(CenterVertically)
                            .paddingFromBaseline(top = 0.dp)
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_play_circle_24),
                        contentDescription = null,
                        tint = TextWhite,
                        modifier = Modifier
                            .size(ButtonDefaults.IconSize)
                    )
                }
            }
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                alignment = BottomEnd,
                modifier = Modifier
                    .size(170.dp)
                    .fillMaxHeight()
                    .weight(1f)
            )
        }
    }
}


@Composable
fun Navigation() {
    var selectedIndex by remember { mutableStateOf(0) }
    val selectedColor = TextWhite
    val unSelectedColor = Grey600
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        elevation = 10.dp
    ) {
        BottomNavigationItem(selected = selectedIndex == 0,
            onClick = { selectedIndex = 0 },
            selectedContentColor = selectedColor,
            unselectedContentColor = unSelectedColor,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = stringResource(R.string.home),
                    modifier = Modifier.size(42.dp)
                )
            })
        BottomNavigationItem(selected = selectedIndex == 1,
            onClick = { selectedIndex = 1 },
            selectedContentColor = selectedColor,
            unselectedContentColor = unSelectedColor,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_timer),
                    contentDescription = stringResource(R.string.timer),
                    modifier = Modifier.size(42.dp)
                )
            })
        BottomNavigationItem(selected = selectedIndex == 2,
            onClick = { selectedIndex = 2 },
            selectedContentColor = selectedColor,
            unselectedContentColor = unSelectedColor,
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.lotus1),
                    contentDescription = stringResource(R.string.meditate),
                    modifier = Modifier.size(36.dp)
                )
            })
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomePreview() {
    HomeScreen()
}