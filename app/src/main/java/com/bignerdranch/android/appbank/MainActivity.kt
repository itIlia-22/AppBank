package com.bignerdranch.android.appbank

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.appbank.view.BinDetailsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, BinDetailsFragment.newInstance())
                .addToBackStack("")
                .commit()
        }
    }
}