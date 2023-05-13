package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.CommunityBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding

class Community : Fragment() {
    private lateinit var binding: CommunityBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): ConstraintLayout {
        binding = CommunityBinding.inflate(inflater, container, false)

        binding.fabBtn.setOnClickListener{add()}

        return binding.root
    }

    private fun add(){

    }


}