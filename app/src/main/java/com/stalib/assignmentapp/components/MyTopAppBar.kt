package com.stalib.assignmentapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyTopAppBar() {

    Surface(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.padding(8.dp),
                    imageVector = Icons.Default.Close, contentDescription = ""
                )

            }

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.padding(8.dp),
                    imageVector = Icons.Default.MoreHoriz, contentDescription = ""
                )

            }


        }

    }

}