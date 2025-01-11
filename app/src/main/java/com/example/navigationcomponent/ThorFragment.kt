package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentThorBinding

class ThorFragment : Fragment() {

    private lateinit var binding: FragmentThorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThorBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root

        binding.button6.setOnClickListener {
            findNavController().navigate(R.id.action_thorFragment_to_captainAmericaFragment)
        }

    }
}