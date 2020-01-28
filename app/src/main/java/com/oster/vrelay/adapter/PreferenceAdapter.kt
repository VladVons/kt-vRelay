package com.example.vrelay.ui.adapter

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
//
import com.example.vrelay.ui.model.PreferenceModel
import com.example.vrelay.R


class PreferenceAdapter(val context : Context, val androidVersionList: ArrayList<PreferenceModel>) : RecyclerView.Adapter<PreferenceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(aGroup: ViewGroup, p1: Int): ViewHolder {
        val Inflater = LayoutInflater.from(aGroup?.context).inflate(R.layout.item_preference, aGroup, false)
        return ViewHolder(Inflater);
    }

    override fun onBindViewHolder(aHolder: ViewHolder, aPos: Int) {
        aHolder.txtTitle.text = androidVersionList[aPos].codeName
        aHolder.txtContent.text = "Version : ${androidVersionList[aPos].versionName}, Api Name : ${androidVersionList[aPos].apiLevel}"
        aHolder.image.setImageResource(androidVersionList[aPos].imgResId!!)
        aHolder.image.setOnClickListener {
            Toast.makeText(context, androidVersionList[aPos].codeName, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return androidVersionList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtTitle = itemView.findViewById<TextView>(R.id.appOSTitle_txtVw)
        val txtContent = itemView.findViewById<TextView>(R.id.appOSDetails_txtVw)
        val image = itemView.findViewById<ImageView>(R.id.appOS_imageVw)
    }
}