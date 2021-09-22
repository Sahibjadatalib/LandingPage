package com.stalib.assignmentapp.components

import android.view.textclassifier.TextSelection
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextSelection(
    modifier: Modifier = Modifier,
    text: String
) {

    Text(
        modifier = modifier.fillMaxWidth().padding(8.dp),
        text = text,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
}