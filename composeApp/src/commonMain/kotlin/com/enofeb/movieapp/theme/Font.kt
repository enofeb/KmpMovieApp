package com.enofeb.movieapp.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import movieappkmm.composeapp.generated.resources.Res
import movieappkmm.composeapp.generated.resources.sfmedium
import movieappkmm.composeapp.generated.resources.sfregular
import movieappkmm.composeapp.generated.resources.sfsemibold
import org.jetbrains.compose.resources.Font

@Composable
fun MovieFontFamily() = FontFamily(
    Font(Res.font.sfregular, weight = FontWeight.Normal),
    Font(Res.font.sfmedium, weight = FontWeight.Medium),
    Font(Res.font.sfsemibold, weight = FontWeight.SemiBold)
)

@Composable
fun MovieTypography() = Typography().run {
    val fontFamily = MovieFontFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = fontFamily),
        displayMedium = displayMedium.copy(fontFamily = fontFamily),
        displaySmall = displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = titleLarge.copy(
            fontFamily = fontFamily,
            fontSize = 22.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 28.sp
        ),
        titleMedium = titleMedium.copy(fontFamily = fontFamily),
        titleSmall = titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = bodySmall.copy(fontFamily = fontFamily),
        labelLarge = labelLarge.copy(fontFamily = fontFamily),
        labelMedium = labelMedium.copy(fontFamily = fontFamily),
        labelSmall = labelSmall.copy(fontFamily = fontFamily)
    )
}

//val defaultStyle = TextStyle(
//    fontFamily = SFFonts
//)
//
//val MovieTypography = Typography(
//    titleMedium = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 16.sp,
//        fontWeight = FontWeight.Medium,
//        lineHeight = 24.sp
//    ),
//    titleSmall = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 14.sp,
//        fontWeight = FontWeight.Medium,
//        lineHeight = 20.sp
//    ),
//    headlineLarge = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 32.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 40.sp
//    ),
//    headlineMedium = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 28.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 36.sp
//    ),
//    headlineSmall = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 24.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 32.sp
//    ),
//    displayLarge = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 57.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 64.sp
//    ),
//    displayMedium = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 45.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 52.sp,
//    ),
//    displaySmall = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 36.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 44.sp
//    ),
//    labelLarge = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 14.sp,
//        fontWeight = FontWeight.Medium,
//        lineHeight = 20.sp
//    ),
//    labelMedium = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 12.sp,
//        fontWeight = FontWeight.Medium,
//        lineHeight = 16.sp
//    ),
//    labelSmall = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 11.sp,
//        fontWeight = FontWeight.Medium,
//        lineHeight = 16.sp
//    ),
//    bodyLarge = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 16.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 24.sp
//    ),
//    bodyMedium = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 14.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 20.sp
//    ),
//    bodySmall = defaultStyle.copy(
//        fontFamily = SFFonts,
//        fontSize = 12.sp,
//        fontWeight = FontWeight.Normal,
//        lineHeight = 16.sp
//    ),
//)

//@Composable
//expect fun font(
//    name: String,
//    res: String,
//    weight: FontWeight,
//    style: FontStyle
//): Font