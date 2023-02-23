package com.example.textmytabs.ui.more

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.textmytabs.R
import com.example.textmytabs.ui.settings.SettingsViewModel

class MoreFragment : Fragment() {


    private lateinit var moreViewModel: MoreViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        moreViewModel = ViewModelProvider(this).get(MoreViewModel::class.java)
        return inflater.inflate(R.layout.fragment_more, container, false)
    }



}