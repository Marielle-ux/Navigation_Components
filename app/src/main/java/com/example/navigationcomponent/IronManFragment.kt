package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.databinding.FragmentHulkBinding
import com.example.navigationcomponent.databinding.IronManFragmentBinding

@Suppress("UNREACHABLE_CODE")
class IronManFragment : Fragment() {

    private lateinit var binding: IronManFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = IronManFragmentBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.iron_man_fragment, container, false)
        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_ironManFragment_to_spiderManFragment)
        }
    }
}
