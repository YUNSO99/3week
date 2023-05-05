package com.example.a3week

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportFragmentManager
                .setFragmentResultListener("requestKey", this) { requestKey, bundle ->
            val result = bundle.getString("bundleKey")
        }
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, result, duration)
        toast.show()

    }

}