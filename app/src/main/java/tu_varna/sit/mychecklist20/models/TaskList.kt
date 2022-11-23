package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasksList_Table")
data class TasksList(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "taskList_ID") val tasksListID: Int,
    @ColumnInfo(name = "icon_Src") val iconSrc: String,
    @Embedded val tasks: Tasks)