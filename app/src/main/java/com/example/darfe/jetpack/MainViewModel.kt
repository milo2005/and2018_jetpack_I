package com.example.darfe.jetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel(){
    var info:MutableLiveData<String> = MutableLiveData()

    fun setInfo(txt:String){
        info.value = txt
    }
}