package com.example.wishes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greet : AppCompatActivity() {
    companion object{
        const val Name_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greet)
   val name= intent.getStringExtra(Name_Extra)
        val myText:TextView=findViewById(R.id.textView)
        myText.text="Happy Birthday\n$name!"
        

    }
}