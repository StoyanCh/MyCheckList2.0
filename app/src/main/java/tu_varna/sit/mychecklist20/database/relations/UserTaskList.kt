package tu_varna.sit.mychecklist20.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import tu_varna.sit.mychecklist20.models.TasksList
import tu_varna.sit.mychecklist20.models.User

data class UserTaskList(
    @Embedded val user: User,
    @Relation(
        parentColumn = "user_ID",
        entityColumn = "taskLIst_ID"
    )
    val UserTasksList: List<TasksList>
)
