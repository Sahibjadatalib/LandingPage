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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.stalib.assignmentapp.R
import com.stalib.assignmentapp.utils.*

@Composable
fun SocialLinkSection(showSnackBar: (String, String) -> Unit) {

    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        SocialMediaLogo(id = R.drawable.facebook, { startActivity(context, facebookIntent, null) })
        SocialMediaLogo(id = R.drawable.twitter, { startActivity(context, twitterIntent, null) })
        SocialMediaLogo(id = R.drawable.linkedin, { startActivity(context, linkedInIntent, null) })
        SocialMediaLogo(id = R.drawable.instagram, { startActivity(context, instagramIntent, null) })
        SocialMediaLogo(id = R.drawable.youtube, { startActivity(context, youtubeIntent, null) })
        SocialMediaLogo(id = R.drawable.tiktok, { startActivity(context, tiktokIntent, null) })

    }
}

@Composable
fun SocialMediaLogo(
    id: Int,
    onClick: ()->Unit
) {

    Surface(
        modifier = Modifier
            .padding(4.dp)
            .size(36.dp),
        shape = RoundedCornerShape(4.dp),
    ) {

        IconButton(onClick = { onClick() }) {
            Image(
                modifier = Modifier.padding(4.dp),
                painter = painterResource(id = id),
                contentDescription = ""
            )
        }

    }
}