package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note

interface NoteRepository {
    fun getNotes(): List<Note>
}