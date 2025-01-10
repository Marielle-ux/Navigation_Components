package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.databinding.FragmentHulkBinding
import com.example.navigationcomponent.databinding.IronManFragmentBinding

class IronManFragment : Fragment() {

    private lateinit var binding: IronManFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = IronManFragmentBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.iron_man_fragment, container, false)
    }
}
