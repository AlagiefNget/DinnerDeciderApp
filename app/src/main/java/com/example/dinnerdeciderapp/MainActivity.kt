package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    private val textView: TextView = findViewById<TextView>(R.id.foodName)
//    textView.setOnClickListener {
//        textView.text = getString(R.string.name)
//    }

//    val str: String = textView.text.toString();



    var foodList  = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese");

    fun decide(view: View){

    }

    fun addFood(view: View){
//        println("the value is $str");
    }
}