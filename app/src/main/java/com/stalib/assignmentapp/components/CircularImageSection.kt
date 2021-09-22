package com.stalib.assignmentapp.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stalib.assignmentapp.R

@Composable
fun CircularImageSection() {

    Surface(
        modifier = Modifier.size(148.dp),
        shape = CircleShape,
        border = BorderStroke(3.dp, Brush.linearGradient(listOf(Color.Yellow, Color.Magenta)))
    ) {

        Image(
            modifier = Modifier.padding(8.dp).clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.eating), contentDescription = ""
        )

    }
}