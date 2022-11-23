package tu_varna.sit.mychecklist20.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import tu_varna.sit.mychecklist20.models.Notes
import tu_varna.sit.mychecklist20.models.User

data class UserNotes(
    @Embedded val user: User,
    @Relation(
        parentColumn = "user_ID",
        entityColumn = "note_ID"
    )
    val NoteList: List<Notes>
)

