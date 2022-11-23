package tu_varna.sit.mychecklist20.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import tu_varna.sit.mychecklist20.models.Tasks
import tu_varna.sit.mychecklist20.models.TasksList

data class NoteNotesList(
    @Embedded val tasksList: TasksList,
    @Relation(
        parentColumn = "taskList_ID",
        entityColumn = "task_ID"
    )
    val listOfTasks: List<Tasks>
)
