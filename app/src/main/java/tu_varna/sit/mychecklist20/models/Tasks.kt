package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "tasks_Table")
data class Tasks(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name ="taskID") val task_ID: Int,
    @ColumnInfo(name = "task_Name")var taskName: String,
    @ColumnInfo(name = "task_State")var taskState: Boolean,
    @ColumnInfo(name = "task_Description")var taskDescription: String,
    @ColumnInfo(name = "task_DueDate")var taskDueDate: Date,
    @Embedded val tag_type: TagType,
    @Embedded val color: Color)