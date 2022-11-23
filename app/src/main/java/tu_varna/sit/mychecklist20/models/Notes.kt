package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_Table")
data class Notes(
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "note_ID") var noteID : Int,
    @ColumnInfo(name = "note_Name")var noteName: String,
    @ColumnInfo(name = "note_Description")var noteDescription: String,
    @ColumnInfo(name = "note_CDate")var noteCDueDate: String,
    @Embedded
    val tag_type: TagType,
    @Embedded
    val color: Color)