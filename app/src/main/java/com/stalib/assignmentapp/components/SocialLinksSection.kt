package com.stalib.assignmentapp.components

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.stalib.assignmentapp.R

@Composable
fun SocialLinkSection(showSnackBar: (String, String) -> Unit) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        SocialMediaLogo(id = R.drawable.facebook, text = "facebook",showSnackBar)
        SocialMediaLogo(id = R.drawable.twitter, text = "twitter",showSnackBar)
        SocialMediaLogo(id = R.drawable.linkedin, text = "linkedin",showSnackBar)
        SocialMediaLogo(id = R.drawable.instagram, text = "instagram",showSnackBar)
        SocialMediaLogo(id = R.drawable.youtube, text = "youtube",showSnackBar)
        SocialMediaLogo(id = R.drawable.tiktok, text = "tiktok",showSnackBar)

    }
}

@Composable
fun SocialMediaLogo(
    id: Int,
    text: String,
    showSnackBar: (String, String) -> Unit
) {

    Surface(
        modifier = Modifier
            .padding(4.dp)
            .size(36.dp),
        shape = RoundedCornerShape(4.dp),
    ) {

        IconButton(onClick = { showSnackBar("$text clicked","Dismiss") }) {
            Image(
                modifier = Modifier.padding(4.dp),
                painter = painterResource(id = id),
                contentDescription = ""
            )
        }

    }
}