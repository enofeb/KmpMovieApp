package com.enofeb.movieapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.enofeb.movieapp.theme.MovieTypography
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

@Composable
fun RowScope.NavigationBarItem(
    modifier: Modifier = Modifier,
    icon: DrawableResource,
    label: String,
    onClick: () -> Unit,
    selected: Boolean
) {
    Column(
        modifier = Modifier.weight(1f).clickable(onClick = onClick),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            colorFilter = if (selected) {
                ColorFilter.tint(Color.White)
            } else {
                ColorFilter.tint(MaterialTheme.colorScheme.secondary)
            },
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = label,
            style = MovieTypography().bodySmall,
            fontWeight = if (selected) {
                FontWeight.Bold
            } else {
                FontWeight.Normal
            },
            color = if (selected) {
                Color.White
            } else {
                MaterialTheme.colorScheme.secondary
            }
        )
    }
}