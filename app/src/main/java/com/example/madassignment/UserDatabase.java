package com.example.madassignment;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;

@Database(entities = {User.class}, version = 1)

public abstract class UserDatabase extends RoomDatabase {
    public abstract UserDao userDao();

}
