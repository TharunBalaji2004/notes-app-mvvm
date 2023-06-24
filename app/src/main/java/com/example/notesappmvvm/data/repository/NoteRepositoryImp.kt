package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note
import com.example.notesappmvvm.util.UiState
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Date

class NoteRepositoryImp(val database: FirebaseFirestore): NoteRepository {

    // Fetches data from Firebase
    override fun getNotes(): UiState<List<Note>> {
        val data = listOf<Note>()

        if (data.isNullOrEmpty()){
            return UiState.Failure("Data is Empty")
        } else {
            return UiState.Success(data)
        }
    }
}