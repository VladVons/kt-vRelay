package com.example.vrelay.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vrelay.R
import com.example.vrelay.ui.lib.ImageClickUrl
import com.example.vrelay.BuildConfig


class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_about, container, false)

        val tvAbout: TextView = rootView.findViewById(R.id.text_version)
        //val Info = context?.getPackageManager()?.getPackageInfo(context?.getPackageName(), 0)
        tvAbout.text =  "%s (%s)".format(getString(R.string.app_name), BuildConfig.VERSION_NAME)

        ImageClickUrl(rootView, R.id.activity_about_logo)
        /*
        import android.widget.ImageView
        import android.content.Intent
        import android.net.Uri

        val imageView: ImageView  = rootView.findViewById(R.id.activity_about_logo)
        imageView.setOnClickListener {
            val urlHome = getString(R.string.url_home)

            //val openURL = Intent(Intent.ACTION_VIEW)
            //openURL.data = Uri.parse(urlHome)
            val openURL = Intent(Intent.ACTION_VIEW, Uri.parse(urlHome))
            startActivity(openURL)
        }
        */

        return rootView
    }
}
