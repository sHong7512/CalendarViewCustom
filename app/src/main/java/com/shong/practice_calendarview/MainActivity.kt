package com.shong.practice_calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shong.practice_calendarview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    internal lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val fragment = CalendarFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.calendarContainer, fragment)
                addToBackStack(fragment.javaClass.simpleName)
                commit()
            }
        }
    }
}