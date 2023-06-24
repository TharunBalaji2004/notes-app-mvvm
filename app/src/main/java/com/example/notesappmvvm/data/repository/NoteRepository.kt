package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note
import com.example.notesappmvvm.util.UiState

interface NoteRepository {
    fun getNotes(): UiState<List<Note>>
}