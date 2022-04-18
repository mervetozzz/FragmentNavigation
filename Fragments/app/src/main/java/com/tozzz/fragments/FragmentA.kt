package com.tozzz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tozzz.fragments.databinding.FragmentABinding

class FragmentA : Fragment() {
    private lateinit var design:FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = FragmentABinding.inflate(inflater,container,false)

        design.gitB.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentADirections.aToB())
        }

        return design.root
    }

}