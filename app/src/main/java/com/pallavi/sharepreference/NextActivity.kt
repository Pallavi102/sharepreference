package com.pallavi.sharepreference

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    lateinit var tvshow:TextView
    lateinit var SharedPreferences:SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        tvshow=findViewById(R.id.tvshow)
        SharedPreferences=getSharedPreferences("file", MODE_PRIVATE)

        val name=SharedPreferences.getString("name","")
        val roll=SharedPreferences.getString("roll","")
        tvshow.text=name


    }
}