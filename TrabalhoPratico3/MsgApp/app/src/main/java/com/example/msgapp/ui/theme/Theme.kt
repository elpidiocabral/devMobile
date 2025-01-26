package com.example.msgapp.ui.theme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF25D366),   
    onPrimary = Color.White,
    secondary = Color(0xFF34B7F1),
    onSecondary = Color.Black,
    surface = Color(0xFFE0F7E9),
    onSurface = Color.Black,
    background = Color(0xFFE0F7E9),
    onBackground = Color.Black

)

@Composable
fun MsgAppTheme(
    darkTheme: Boolean = false, // Você pode implementar controle de tema dinâmico
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}