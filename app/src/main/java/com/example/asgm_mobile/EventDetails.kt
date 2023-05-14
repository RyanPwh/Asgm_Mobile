package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.EventDetailsBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding
import android.widget.SearchView
import androidx.core.os.bundleOf
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.asgm_mobile.R
import com.example.asgm_mobile.EventViewModel
import com.example.asgm_mobile.EventAdapter

class EventDetails : Fragment() {

    private val cv: EventViewModel by activityViewModels()
    private lateinit var adapter: EventAdapter

    private lateinit var binding: EventDetailsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = EventDetailsBinding.inflate(inflater, container ,false)

        adapter = EventAdapter { holder, comps ->
        }
        binding.rv.adapter = adapter
        binding.rv.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

        cv.getEventLiveData().observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        return binding.root
    }
}