package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "reminders_Table")
data class Reminders(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "reminder_ID") val reminderID: Int,
    @ColumnInfo(name = "reminder_Name") var reminderName: String,
    @ColumnInfo(name = "reminder_Date") var reminderDate: Date,
    @ColumnInfo(name = "reminder_Hour") var reminderHour: Date,
    @ColumnInfo(name = "reminder_Repeat") var reminderRepeat: Date,
    @ColumnInfo(name = "reminder_Repeat_Count") var reminderRepeatCount: Int
)