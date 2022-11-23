package tu_varna.sit.mychecklist20.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import tu_varna.sit.mychecklist20.models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM USER_TABLE ORDER BY user_ID DESC")
    fun showAllUsers(): LiveData<List<User>>

    @Query("DELETE FROM USER_TABLE WHERE user_ID = :userID")
    fun deleteUserById(userID: Int)

    @Query("UPDATE USER_TABLE SET user_Password = :userPassword WHERE user_ID = :userID")
    fun updateUserPassword(userPassword: String, userID: Int)

    @Query("UPDATE USER_TABLE SET user_Email = :userEmail WHERE user_ID =:userID")
    fun updateUserEmail(userEmail: String, userID: Int)

}