package com.stalib.assignmentapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.stalib.assignmentapp.R
import com.stalib.assignmentapp.ui.theme.BlueGrey900
import com.stalib.assignmentapp.utils.*

@Composable
fun ButtonSection(
    modifier: Modifier = Modifier,
    showSnackBar: (String, String)->Unit
) {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ){


        ButtonSectionComp(
            id = R.drawable.recipe1,
            text = "View today's recipe",
            onClick = { startActivity(context, newRecipeIntent, null) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        ButtonSectionComp(
            id = R.drawable.recipe2,
            text = "View all my recipes",
            onClick = { startActivity(context, allRecipeIntent, null) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        ButtonSectionComp(
            id = R.drawable.gmail,
            text = "Email me",
            onClick = { startActivity(context, emailIntent, null) }
        )

        Spacer(modifier = Modifier.height(16.dp))

        ButtonSectionComp(
            id = R.drawable.newsletter,
            text = "Subscribe to my tasty newsletter",
            onClick = { startActivity(context, newsletterIntent, null) }
        )

        Spacer(modifier = Modifier.height(16.dp))

    }


}

@Composable
fun ButtonSectionComp(
    id: Int,
    text: String,
    onClick: ()->Unit
) {

    Surface(
        modifier = Modifier
            .fillMaxWidth(),
        color = BlueGrey900,
        shape = RoundedCornerShape(8.dp)
    ) {

        Row(
            modifier = Modifier.clickable { onClick() },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ){

            Card(
                modifier = Modifier.size(48.dp).padding(8.dp),
                shape = RoundedCornerShape(4.dp)
            ) {
                Image(
                    modifier = Modifier,
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = id), contentDescription = "")
            }

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                modifier = Modifier.padding(8.dp),
                text = text,
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                textAlign = TextAlign.Start,
                color = Color.White
            )


        }


    }
}