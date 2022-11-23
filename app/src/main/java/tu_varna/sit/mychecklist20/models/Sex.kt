package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userSex_Table")
data class Sex(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "sex_ID") val sexID: Int,
    @ColumnInfo(name = "sex_Var") val sexVar:String
)
