package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note

interface Repository {
    fun getNotes(): List<Note>
}