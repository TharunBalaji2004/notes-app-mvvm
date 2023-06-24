package com.example.notesappmvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notesappmvvm.R
import com.example.notesappmvvm.databinding.FragmentNoteListingBinding

class NoteListingFragment : Fragment() {

    private lateinit var binding: FragmentNoteListingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

}