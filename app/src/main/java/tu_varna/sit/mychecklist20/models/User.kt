package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_Table")
class User (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "user_ID") val userID: Int,
    @ColumnInfo(name = "user_UserName") val userUserName: String,
    @ColumnInfo(name = "user_Password")var userPassword: String,
    @ColumnInfo(name = "user_Email")var userEmail: String,
    @Embedded val sex: Sex,
    @Embedded val tasksList: TasksList,
    @Embedded val tasks: Tasks)