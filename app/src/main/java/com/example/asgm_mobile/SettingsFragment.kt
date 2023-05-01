package com.example.asgm_mobile

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.asgm_mobile.databinding.SettingActivityBinding
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class SettingsFragment : Fragment() {

    private lateinit var binding: SettingActivityBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): ConstraintLayout {
        binding = SettingActivityBinding.inflate(inflater, container ,false)

        binding.aboutUsButton.setOnClickListener{view: View->
            view.findNavController()
                .navigate(R.id.action_settingsFragment_to_aboutus)}

        binding.ppSetting.setOnClickListener{view: View->
            view.findNavController()
                .navigate(R.id.action_settingsFragment_to_privacyPolicy)}

        binding.langSetting.setOnClickListener{callToast()}

        return binding.root
    }

    private fun callToast(){
        Toast.makeText(context,"Please Change Your System Languages to Proceed!", Toast.LENGTH_LONG).show()
    }


}