package com.example.asgm_mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.asgm_mobile.databinding.CommunitysBinding
import com.example.asgm_mobile.databinding.SettingActivityBinding

class Community : Fragment() {
    private lateinit var binding: CommunitysBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): ConstraintLayout {
        binding = CommunitysBinding.inflate(inflater, container, false)

        binding.addBtn.setOnClickListener{view : View ->
            view.findNavController()
                .navigate(R.id.action_community_to_communityPost)
        }

        return binding.root
    }

}