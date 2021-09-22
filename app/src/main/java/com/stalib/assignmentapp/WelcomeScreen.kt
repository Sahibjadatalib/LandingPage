package com.stalib.assignmentapp

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.stalib.assignmentapp.components.*

@Composable
fun WelcomeScreen(
    actions: MainActions
) {

    val scrollState = rememberScrollState()

    Box(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)) {


        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Spacer(modifier = Modifier.height(16.dp))

            CircularImageSection()
            Spacer(modifier = Modifier.height(8.dp))

            SubtitleSection(text = stringResource(R.string.subtitle_text))
            Spacer(modifier = Modifier.height(8.dp))

            TextSelection(text = stringResource(R.string.detail_text))
            Spacer(modifier = Modifier.height(8.dp))

            SocialLinkSection(showSnackBar = actions.showSnackBar)
            Spacer(modifier = Modifier.height(8.dp))

            ButtonSection(showSnackBar = actions.showSnackBar)

        }

        IconButton(
            onClick = { actions.showSnackBar("Close clicked", "Dismiss") },
            modifier = Modifier.align(Alignment.TopStart),
        ) {
            Icon(
                imageVector = Icons.Default.Close, contentDescription = ""
            )
        }

        IconButton(
            onClick = { actions.showSnackBar("More clicked", "Dismiss") },
            modifier = Modifier.align(Alignment.TopEnd),
        ) {
            Icon(
                imageVector = Icons.Default.MoreHoriz, contentDescription = ""
            )
        }
    }

}