package com.finepointmobile.daggerconfirmation;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by danielmalone on 8/1/17.
 */

@Dao
public interface UserDao {
    @Query("SELECT * FROM users")
    List<User> getAllUsers();

    @Insert
    void insertUser(User user);
}
