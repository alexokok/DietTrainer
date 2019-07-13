package com.mazaev.diettrainer.ui.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

/**
 * @author Alexey Mazaev
 */
abstract class BaseFragment : Fragment() {

    abstract fun getLayoutResId(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutResId(), null)
    }

    fun setSupportActionBar(actionBar: Toolbar?) {
        (activity as AppCompatActivity).setSupportActionBar(actionBar)
    }
}