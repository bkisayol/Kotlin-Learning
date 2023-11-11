package com.example.rentalcar


import android.view.Menu
import androidx.appcompat.app.AppCompatActivity



class CarsCard : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

}