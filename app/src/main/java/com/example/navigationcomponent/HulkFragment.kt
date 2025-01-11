package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentCaptainAmericaBinding
import com.example.navigationcomponent.databinding.FragmentHulkBinding

@Suppress("UNREACHABLE_CODE")
class HulkFragment : Fragment() {
    private lateinit var binding: FragmentHulkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHulkBinding.inflate(layoutInflater, container, false)

        return binding.root

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_hulkFragment_to_thorFragment)
        }
    }
}


