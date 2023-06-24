package com.example.notesappmvvm.data.repository

import com.example.notesappmvvm.data.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import java.util.Date

class NoteRepositoryImp(val database: FirebaseFirestore): NoteRepository {

    // Fetches data from Firebase
    override fun getNotes(): List<Note> {
        return arrayListOf(
            Note(
                id = "abiw",
                text = "Note 1",
                date = Date()
            ),
            Note(
                id = "kpar",
                text = "Note 2",
                date = Date()
            ),
            Note(
                id = "bxmp",
                text = "Note 3",
                date = Date()
            )
        )
    }
}