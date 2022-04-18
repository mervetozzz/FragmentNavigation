package com.tozzz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.tozzz.fragments.databinding.FragmentABinding
import com.tozzz.fragments.databinding.FragmentXBinding

class FragmentX : Fragment() {
    private lateinit var design: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {
        design = FragmentXBinding.inflate(inflater,container,false)

        design.gitY.setOnClickListener {
            Navigation.findNavController(it).navigate(FragmentXDirections.xToY())
        }
        return design.root
    }
}