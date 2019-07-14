package com.mazaev.diettrainer.ui.schedule

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mazaev.diettrainer.R
import com.mazaev.diettrainer.model.Schedule
import java.util.*

/**
 * @author Alexey Mazaev
 */
class ScheduleAdapter : RecyclerView.Adapter<ScheduleAdapter.ViewHolder>() {

    private val schedule: ArrayList<Schedule> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_schedule, parent)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = schedule.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val scheduleItem = schedule[position]
        holder.setItem(scheduleItem)
    }

    fun setData(schedule: List<Schedule>) {
        this.schedule.clear()
        this.schedule.addAll(schedule)

        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val timeView: TextView = itemView.findViewById(R.id.schedule_value)
        private val switchView: Switch = itemView.findViewById(R.id.schedule_switch)
        private val descriptionTitleView: TextView = itemView.findViewById(R.id.schedule_description_title)
        private val descriptionValueView: TextView = itemView.findViewById(R.id.schedule_description_value)
        private val deleteView: TextView = itemView.findViewById(R.id.schedule_delete)

        fun setItem(schedule: Schedule) {
            timeView.text = schedule.time.toString()
            val emptyDescription = TextUtils.isEmpty(schedule.description)
            descriptionTitleView.visibility = if (emptyDescription) GONE else VISIBLE
            descriptionValueView.visibility = if (emptyDescription) GONE else VISIBLE
            descriptionValueView.text = schedule.description
        }
    }
}