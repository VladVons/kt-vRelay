package com.example.vrelay.ui.lib

import android.view.View
import android.widget.ImageView
import com.example.vrelay.R
import android.content.Intent
import android.net.Uri


fun ImageClickUrl(aView: View, aResID: Int) {
    val urlHome = aView.resources.getString(R.string.url_home)
    val imageView: ImageView = aView.findViewById(aResID)
    imageView.setOnClickListener {
        val openURL = Intent(Intent.ACTION_VIEW, Uri.parse(urlHome))
        aView.context.startActivity(openURL)
    }
}

