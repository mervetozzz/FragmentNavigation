package com.tozzz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tozzz.fragments.databinding.FragmentABinding
import com.tozzz.fragments.databinding.FragmentAnaSayfaBinding

class FragmentAnaSayfa : Fragment() {
    private lateinit var design:FragmentAnaSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        design = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        design.gitA.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentAnaSayfaDirections.mainToA())
        }

        design.gitX.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentAnaSayfaDirections.mainToX())
        }

        return design.root
    }
}