package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.PrivacyPolicyBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding

class PrivacyPolicy : Fragment() {

    private lateinit var binding: PrivacyPolicyBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): ConstraintLayout {
        binding = PrivacyPolicyBinding.inflate(inflater, container ,false)



        return binding.root
    }
}