package com.example.vrelay.ui.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vrelay.R
import com.example.vrelay.ui.lib.ImageClickUrl


class AboutFragment : Fragment() {
    private lateinit var aboutViewModel: AboutViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        val textView: TextView = view.findViewById(R.id.text_about)

        textView.text = "My simple string"
        val Info = context?.getPackageManager()?.getPackageInfo(context?.getPackageName(), 0)

        ImageClickUrl(view, R.id.activity_about_logo)
        /*
        import android.widget.ImageView
        import android.content.Intent
        import android.net.Uri

        val imageView: ImageView  = root.findViewById(R.id.activity_about_logo)
        imageView.setOnClickListener {
            val urlHome = getString(R.string.url_home)

            //val openURL = Intent(Intent.ACTION_VIEW)
            //openURL.data = Uri.parse(urlHome)
            val openURL = Intent(Intent.ACTION_VIEW, Uri.parse(urlHome))
            startActivity(openURL)
        }
        */

        return view
    }
}
