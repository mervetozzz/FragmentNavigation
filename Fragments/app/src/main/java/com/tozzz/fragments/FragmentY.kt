package com.tozzz.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.tozzz.fragments.databinding.FragmentYBinding

class FragmentY : Fragment() {
    private lateinit var design: FragmentYBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        design = FragmentYBinding.inflate(inflater, container, false)
        design.geriGit.setOnClickListener {
            Snackbar.make(it,"Hoş geldin Neo. Tahmin edebileceğin gibi ben Morpheus’um.", Snackbar.LENGTH_LONG).show()
            Navigation.findNavController(it).navigate(FragmentYDirections.yToMain())
        }
        return design.root
    }

}