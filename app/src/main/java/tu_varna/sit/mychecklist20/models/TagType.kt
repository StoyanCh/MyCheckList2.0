package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tagType_Table")
data class TagType (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="type_ID") var typeID :Int,
    @ColumnInfo(name = "type_Name")var typeName: String)