package com.stalib.assignmentapp.utils

import android.content.Intent
import android.net.Uri

val facebookIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.instagram.com/stalib440/")
}

val youtubeIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.youtube.com/watch?v=ThDYazipjSI")
}

val instagramIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.instagram.com/stalib440/")
}

val tiktokIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.youtube.com/watch?v=uD4izuDMUQA")
}

val twitterIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://twitter.com/Stalib420")
}

val linkedInIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.linkedin.com/in/sahibjadatalib/")
}

val newRecipeIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.allrecipes.com/recipe/189930/southern-pimento-cheese/")
}

val allRecipeIntent = Intent(Intent.ACTION_VIEW).apply {
    data = Uri.parse("https://www.allrecipes.com/")
}

val emailIntent = Intent(Intent.ACTION_SEND).apply {
    putExtra(Intent.EXTRA_EMAIL, arrayOf("stalib40@gmail.com"))
    putExtra(Intent.EXTRA_SUBJECT, "")
    putExtra(Intent.EXTRA_TEXT, "i want to say...")
    type = "message/rfc822"
}

val newsletterIntent = Intent(Intent.ACTION_SEND).apply {
    putExtra(Intent.EXTRA_EMAIL, arrayOf("stalib40@gmail.com"))
    putExtra(Intent.EXTRA_SUBJECT, "")
    putExtra(Intent.EXTRA_TEXT, "i want to subscribe to your...")
    type = "message/rfc822"
}




