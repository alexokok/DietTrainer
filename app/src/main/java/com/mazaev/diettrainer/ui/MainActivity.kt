package com.mazaev.diettrainer.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mazaev.diettrainer.R
import com.mazaev.diettrainer.ui.schedule.ScheduleFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_frame_container, ScheduleFragment())
            .commit()
    }
}
