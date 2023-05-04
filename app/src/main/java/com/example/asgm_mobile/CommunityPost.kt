package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.CommunityBinding
import com.example.asgm_mobile.databinding.CommunityPostBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding

class CommunityPost : Fragment() {
    private lateinit var binding: CommunityPostBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): ConstraintLayout {
        binding = CommunityPostBinding.inflate(inflater, container, false)



        return binding.root
    }

}