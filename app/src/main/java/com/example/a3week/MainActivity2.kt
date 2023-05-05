package com.example.a3week

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3week.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val extras = intent.extras
        val data = extras!!["text"]

        viewBinding.tv_secondtext.text = data

        viewBinding.btnNext.setOnClickListener{
            val mIntent = Intent(this, MainActivity::class.java).apply {
                putExtra(MainActivity.STRING_INTENT_KEY, "Back")
            }
            setResult(RESULT_OK, mIntent)
            if (!isFinishing) finish()
        }

    }
}