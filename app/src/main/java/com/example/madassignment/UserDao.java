package com.example.madassignment;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface UserDao
{
    // Dao for users
    @Insert
    void insert(User... user);

    @Update
    void update(User... user);

    @Delete
    void delete(User... user);

    @Query("SELECT * FROM users ORDER BY user_wins DESC")
    List<User> getAllUsers();

//    @Query("SELECT user_name AND user_icon FROM users")
//    List<User> getAllUsersNameAndIcon();

    @Query("SELECT * FROM users WHERE user_name = :userName")
    User getUsersByName(String userName);

    @Query("SELECT * FROM users WHERE id = :userId")
    User getUserByID(long userId);


    @Query("UPDATE users SET user_wins = user_wins + 1 WHERE id = :userId")
    void updateUserWins(long userId);


    @Query("UPDATE users SET user_losses = user_losses + 1 WHERE id = :userId")
    void updateUserLosses(long userId);

    @Query("UPDATE users SET user_games = user_games + 1 WHERE id = :userId")
    void updateUserGamesPlayed(long userId);

    @Query("UPDATE users SET user_name = :userName WHERE id = :userId")
    void updateUserName(long userId, String userName);

    @Query("UPDATE users SET user_icon = :userIcon WHERE id = :userId")
    void updateUserIcon(long userId, int userIcon);

    @Query("DELETE FROM users WHERE id = :userId")
    void deleteUser(long userId);
}
