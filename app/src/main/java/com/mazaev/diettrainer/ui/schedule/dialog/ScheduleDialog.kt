package com.mazaev.diettrainer.ui.schedule.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.mazaev.diettrainer.R

/**
 * @author Alexey Mazaev
 */
class ScheduleDialog : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.dialog_schedule, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val alarmTimeView = view.findViewById<TextView>(R.id.schedule_dialog_time_value)
        alarmTimeView.setOnClickListener { }

        val descriptionView = view.findViewById<EditText>(R.id.schedule_dialog_description_value)

        val saveView = view.findViewById<Button>(R.id.schedule_dialog_save)
        saveView.setOnClickListener { }
    }
}