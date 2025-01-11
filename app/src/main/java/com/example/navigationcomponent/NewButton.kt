package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentNewButtonBinding
import data.RetrofitService
import kotlinx.coroutines.launch
import android.util.Log

class NewButton : Fragment() {
    private lateinit var binding: FragmentNewButtonBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewButtonBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.newButton.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val data = RetrofitService.apiService.getFact()
                    binding.textViewFact.text = data.text
                } catch (e: Exception) {
                    Log.d("Error", e.message.toString())
                }
            }
        }

    }
}