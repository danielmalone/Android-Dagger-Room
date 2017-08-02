package com.finepointmobile.daggerconfirmation;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by danielmalone on 8/1/17.
 */

@Entity(tableName = "users")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo
    private String mFirstName;

    @ColumnInfo
    private String mLastname;

    @ColumnInfo
    private String mEmail;

    public User(String firstName, String lastname, String email) {
        mFirstName = firstName;
        mLastname = lastname;
        mEmail = email;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}
