package com.example.darfe.jetpack.util

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

inline fun <reified T:ViewModel>AppCompatActivity.viewModel():T = ViewModelProviders
    .of(this)
    .get(T::class.java)