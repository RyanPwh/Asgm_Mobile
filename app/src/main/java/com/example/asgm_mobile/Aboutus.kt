package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.AboutUsBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding

class Aboutus : Fragment() {
    private lateinit var binding: AboutUsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): ConstraintLayout {
        binding = AboutUsBinding.inflate(inflater, container ,false)



        return binding.root
    }
}