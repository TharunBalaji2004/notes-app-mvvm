package com.example.notesappmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notesappmvvm.data.model.Note
import com.example.notesappmvvm.data.repository.NoteRepository
import com.example.notesappmvvm.data.repository.NoteRepositoryImp
import com.example.notesappmvvm.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(val repository: NoteRepository): ViewModel() {

    private val _notes = MutableLiveData<UiState<List<Note>>>()
    var notes: LiveData<UiState<List<Note>>> = _notes

    fun getNotes(){
        _notes.value = UiState.Loading
        _notes.value = repository.getNotes()
    }
}