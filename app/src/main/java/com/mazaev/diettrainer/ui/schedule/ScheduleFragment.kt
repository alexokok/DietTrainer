package com.mazaev.diettrainer.ui.schedule

import android.os.Bundle
import android.view.*
import android.view.View.VISIBLE
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.mazaev.diettrainer.R
import com.mazaev.diettrainer.ui.common.BaseFragment

/**
 * @author Alexey Mazaev
 */
class ScheduleFragment : BaseFragment() {
    override fun getLayoutResId(): Int = R.layout.fragment_schedule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val appBar = view.findViewById<BottomAppBar>(R.id.schedule_app_bar)
        setSupportActionBar(appBar)

        appBar.fabAlignmentMode = BottomAppBar.FAB_ALIGNMENT_MODE_END

        val addButton = view.findViewById<FloatingActionButton>(R.id.schedule_add_fab)
        addButton.setOnClickListener {
            Toast.makeText(context, "Add item", Toast.LENGTH_SHORT).show()
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.schedule_list)
        val adapter = ScheduleAdapter()

        recyclerView.adapter = adapter

        val emptySchedulePlaceholderView = view.findViewById<ViewStub>(R.id.schedule_placeholder)
        emptySchedulePlaceholderView.visibility = VISIBLE
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.schedule_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.schedule_support -> Toast.makeText(context, "Send message with problem", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}