package com.pallavi.sharepreference

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etname:EditText
    lateinit var etroll:EditText
    lateinit var bsave:Button
    lateinit var SharedPreferences:SharedPreferences
    lateinit var editor:SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         SharedPreferences=getSharedPreferences("file", MODE_PRIVATE)



        etname=findViewById(R.id.etname)
        etroll=findViewById(R.id.etroll)
        bsave=findViewById(R.id.bsave)
        bsave.setOnClickListener {
            editor=SharedPreferences.edit()
            val name=etname.text.toString()
            val roll=etroll.text.toString()
            editor.putString("name",name)
            editor.putString("roll",roll)
         editor.apply()

          val intent= Intent(this,NextActivity::class.java)
            startActivity(intent)
            finish()
















        }

    }
}