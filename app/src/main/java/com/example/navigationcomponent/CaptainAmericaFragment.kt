package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentCaptainAmericaBinding
import data.RetrofitService
import kotlinx.coroutines.launch

class CaptainAmericaFragment : Fragment() {

    private lateinit var binding: FragmentCaptainAmericaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCaptainAmericaBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            findNavController().navigate(R.id.action_captainAmericaFragment_to_hulkFragment)
        }
    }
}
