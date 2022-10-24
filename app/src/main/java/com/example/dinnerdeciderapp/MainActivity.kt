package com.example.dinnerdeciderapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var addFoodButton: Button
    lateinit var decideButton: Button
    lateinit var newFood: EditText
    lateinit var foodChoiceText: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFoodButton = findViewById(R.id.addFood);
        decideButton = findViewById(R.id.decide);
        newFood = findViewById(R.id.newFood)
        foodChoiceText = findViewById(R.id.choice);
    }

    var foodList  = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese");

    fun addFood(view: View){
        val food = newFood.text.toString();
        foodList.add(food);
        foodChoiceText.text = food;
        newFood.setText("");
    }

    fun decide(view: View){
        val idx = (Math.random() * foodList.size).toInt();
        val choice = foodList[idx];
        foodChoiceText.text = choice;
    }
}