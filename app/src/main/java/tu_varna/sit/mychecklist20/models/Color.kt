package tu_varna.sit.mychecklist20.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Color(
    @PrimaryKey(autoGenerate = true) val color_ID: Int,
    @ColumnInfo(name = "color_name")val colorName: String?
)