package com.example.notesappmvvm.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.notesappmvvm.R
import com.example.notesappmvvm.databinding.FragmentNoteListingBinding
import com.example.notesappmvvm.util.UiState
import com.example.notesappmvvm.viewmodel.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteListingFragment : Fragment() {

    private val TAG: String = "NoteListingFragment"
    private lateinit var binding: FragmentNoteListingBinding
    val viewModel: NoteViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteListingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getNotes()
        viewModel.notes.observe(viewLifecycleOwner) { state ->
            when(state) {
                is UiState.Loading -> {
                    Log.d(TAG, "Loading...")
                }
                is UiState.Failure -> {
                    Log.e(TAG, state.error.toString())
                }
                is UiState.Success -> {
                    state.data.forEach {
                        Log.d(TAG, it.toString())
                    }
                }
            }

        }
    }

}