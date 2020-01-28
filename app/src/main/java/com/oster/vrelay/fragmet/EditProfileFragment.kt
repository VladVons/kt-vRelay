package com.example.vrelay.ui.edit_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.vrelay.R


class EditProfileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_edit_profile, container, false)
        //val textView: TextView = rootView.findViewById(R.id.text_gallery)
        return rootView
    }
}
