package tu_varna.sit.mychecklist20.database.data

import android.graphics.Color
import androidx.room.Database
import androidx.room.RoomDatabase
import tu_varna.sit.mychecklist20.database.dao.NotesDao
import tu_varna.sit.mychecklist20.database.dao.UserDao
import tu_varna.sit.mychecklist20.models.*

@Database(version = 1, entities = [Color::class, Notes::class, Reminders::class, Sex::class, TagType::class, TasksList::class, Tasks::class, User::class])
abstract class TaskListDatabase : RoomDatabase() {
    abstract fun getNotesDao(): NotesDao

    abstract fun getUsersDao(): UserDao
}