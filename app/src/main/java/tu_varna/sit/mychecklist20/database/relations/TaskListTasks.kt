package tu_varna.sit.mychecklist20.database.relations

import androidx.room.Embedded
import androidx.room.Relation
import tu_varna.sit.mychecklist20.models.TasksList

data class TaskListTasks(
    @Embedded val tasksList: TasksList,
    @Relation(
        parentColumn = "taskList_ID",
        entityColumn = "task_ID"
    )
    val TaskListTask: List<TasksList>
)
