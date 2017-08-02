package com.finepointmobile.daggerconfirmation;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by danielmalone on 8/1/17.
 */

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)
    private int mId;

    @ColumnInfo
    private String mFirstName;

    @ColumnInfo
    private String mLastname;

    @ColumnInfo
    private String mEmail;

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
