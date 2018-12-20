package com.example.darfe.jetpack.lifecycle

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class GeoLocation(owner:LifecycleOwner): LifecycleObserver{

    init {
        owner.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startLocation(){
        Log.i("LifeCycle", "Inicio la localizacion")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopLocation(){
        Log.i("LifeCycle", "Paro la localizacion")
    }

}