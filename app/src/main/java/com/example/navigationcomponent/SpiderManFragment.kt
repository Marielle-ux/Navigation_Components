package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentSpiderManBinding


class SpiderManFragment : Fragment() {

    private lateinit var binding: FragmentSpiderManBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpiderManBinding.inflate(layoutInflater, container, false)
        return binding.root

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_spiderManFragment_to_thorFragment)
        }
    }
}

