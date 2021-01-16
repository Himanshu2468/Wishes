package com.example.wishes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.wishes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun createBirthdayCard(view: View) {
        val name=binding.Nameinput.editableText.toString()
        val intent= Intent(this,Greet::class.java)
             intent.putExtra(Greet.Name_Extra,name)
        startActivity(intent)


        Toast.makeText(this,"Name is $name",Toast.LENGTH_SHORT).show()
    }
}