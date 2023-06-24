package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note

class RepositoryImp: Repository {
    override fun getNotes(): List<Note> {
        return listOf()
    }
}