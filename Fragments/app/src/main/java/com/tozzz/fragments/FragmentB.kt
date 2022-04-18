package com.tozzz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tozzz.fragments.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private lateinit var design: FragmentBBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {
        design = FragmentBBinding.inflate(inflater,container,false)

        design.gitY2.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentBDirections.bToY())
        }
        return design.root
    }

}