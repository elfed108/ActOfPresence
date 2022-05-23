package com.github.elfed108.actofpresence.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.github.elfed108.actofpresence.R


val calmPathList = listOf(
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_1,
        R.string.path_description_1
    ),
    DrawableStringTriple(
        R.drawable.group2,
        R.string.path_title_1,
        R.string.path_description_2
    ),
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_1,
        R.string.path_description_3
    ),
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_1,
        R.string.path_description_3
    ),
)

val clarityPathList = listOf(
    DrawableStringTriple(
        R.drawable.group2,
        R.string.path_title_2,
        R.string.path_description_1
    ),
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_2,
        R.string.path_description_2
    ),
    DrawableStringTriple(
        R.drawable.group2,
        R.string.path_title_2,
        R.string.path_description_3
    ),
    DrawableStringTriple(
        R.drawable.group2,
        R.string.path_title_2,
        R.string.path_description_3
    ),
)

val sustainabilityPathList = listOf(
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_3,
        R.string.path_description_1
    ),
    DrawableStringTriple(
        R.drawable.group2,
        R.string.path_title_3,
        R.string.path_description_2
    ),
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_3,
        R.string.path_description_3
    ),
    DrawableStringTriple(
        R.drawable.group,
        R.string.path_title_3,
        R.string.path_description_3
    ),
)

val meditationTypeList = listOf(
    R.drawable.calm to R.string.sustainability,
    R.drawable.ic_focus to R.string.clarity,
    R.drawable.ic_relax to R.string.calm,
    R.drawable.free_icon_font_hand_holding_heart_5069104 to R.string.heartiness,
    R.drawable.free_man_hart to R.string.metta,
    R.drawable.calm to R.string.sustainability,
    R.drawable.ic_focus to R.string.clarity,
    R.drawable.ic_relax to R.string.calm,
    R.drawable.free_icon_font_hand_holding_heart_5069104 to R.string.heartiness,
    R.drawable.free_man_hart to R.string.metta,
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

data class DrawableStringTriple(
    @DrawableRes val drawable: Int,
    @StringRes val title: Int,
    @StringRes val description: Int
)
