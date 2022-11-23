package tu_varna.sit.mychecklist20.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import tu_varna.sit.mychecklist20.models.Notes

@Dao
interface NotesDao {
    @Query("SELECT * FROM notes_Table ORDER BY note_CDate DESC")
    fun showAllNotes(): LiveData<List<Notes>>

    @Query("SELECT * FROM notes_Table WHERE type_Name ORDER BY note_CDate DESC")
    fun showTagTypeOneNotes(): LiveData<List<Notes>>

    @Query("DELETE FROM notes_Table WHERE note_ID = :note_ID")
    fun deleteNoteByNoteId(note_ID: Int)

    @Query("UPDATE notes_Table SET note_Name = :noteName WHERE note_ID = :noteID")
    fun updateTour(noteID: Int, noteName: String?): Int
}