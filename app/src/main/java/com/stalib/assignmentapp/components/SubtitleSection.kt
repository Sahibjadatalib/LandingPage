package com.stalib.assignmentapp.components

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SubtitleSection(
    modifier: Modifier = Modifier,
    text: String
) {

    Text(
        modifier = modifier.padding(8.dp),
        text = text,
        fontWeight = FontWeight.W500,
        fontSize = 24.sp
    )
}