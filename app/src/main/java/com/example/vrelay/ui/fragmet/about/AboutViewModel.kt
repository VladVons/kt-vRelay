package com.example.vrelay.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {
    val text: LiveData<String> = MutableLiveData<String>().apply {value = "This is about Fragment" }
}