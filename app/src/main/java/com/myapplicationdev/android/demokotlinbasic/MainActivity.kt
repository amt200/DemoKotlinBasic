package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            val year = Calendar.getInstance().get(Calendar.YEAR);
            val age = year - userDOB.toInt()
            tvShowAge.text = "Your age is $age"
        }
    }
}