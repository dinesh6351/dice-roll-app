package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById(R.id.button)
        rollButton.setOnClickListener {
            // Do a dice roll when the app starts
          rollDice()
            }
    }

    /** Roll the dice and update the screen with the result.
     *
     */
          private fun rollDice() {
              //create new dice with 6 sides and roll the dice
            val dice = Dice(6)
            val diceRoll = dice.roll()
              //find the imageview in the layout
              val diceImage: ImageView= findViewById(R.id.imageView)
             when (diceRoll) {
                  1 -> diceImage.setImageResource(R.drawable.dice_1)
                  2 -> diceImage.setImageResource(R.drawable.dice_2)
                  3 -> diceImage.setImageResource(R.drawable.dice_3)
                  4 -> diceImage.setImageResource(R.drawable.dice_4)
                  5 -> diceImage.setImageResource(R.drawable.dice_5)
                  6 -> diceImage.setImageResource(R.drawable.dice_6)
              }


        }
    }

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}



