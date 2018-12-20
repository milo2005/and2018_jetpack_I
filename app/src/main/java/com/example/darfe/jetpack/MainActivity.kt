package com.example.darfe.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.darfe.jetpack.lifecycle.GeoLocation
import com.example.darfe.jetpack.util.viewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val geo: GeoLocation = GeoLocation(this)
    val vm: MainViewModel by lazy { viewModel<MainViewModel>() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.info.observe(this, Observer {
            txt.text = it
        })

        btn.setOnClickListener { vm.setInfo("Dario Ch") }
    }


}
