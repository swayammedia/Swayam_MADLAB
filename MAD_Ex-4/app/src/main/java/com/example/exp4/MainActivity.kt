package com.example.exp4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load Basic Details Fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container_basic_details, BasicDetailsFragment())
            commit()
        }

        // Load Mark Details Fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container_mark_details, MarkDetailsFragment())
            commit()
        }
    }
}
