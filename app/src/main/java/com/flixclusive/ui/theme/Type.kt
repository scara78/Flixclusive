package com.flixclusive.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.flixclusive.R

val spaceGrotesk = FontFamily(
    fonts = listOf(
        Font(resId = R.font.space_grotesk_regular),
        Font(resId = R.font.space_grotesk_light, weight = FontWeight.Light),
        Font(resId = R.font.space_grotesk_medium, weight = FontWeight.Medium),
        Font(resId = R.font.space_grotesk_semibold, weight = FontWeight.SemiBold),
        Font(resId = R.font.space_grotesk_bold, weight = FontWeight.Bold)
    )
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 96.sp,
        letterSpacing = (-1.5).sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.1.em
    ),
    displayMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 60.sp,
        letterSpacing = (-0.5).sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.1.em
    ),
    displaySmall = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        letterSpacing = 0.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.1.em
    ),
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 34.sp,
        letterSpacing = 0.25.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.25.em
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        letterSpacing = 0.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.25.em
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.25.em
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.25.em
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    titleSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        letterSpacing = 0.15.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.25.em
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.15.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    labelLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 0.1.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        letterSpacing = 0.1.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    ),
    labelSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        letterSpacing = 0.1.sp,
        fontFamily = spaceGrotesk,
        lineHeight = 1.5.em
    )
)
