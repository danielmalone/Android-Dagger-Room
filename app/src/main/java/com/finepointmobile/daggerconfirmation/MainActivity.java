package com.finepointmobile.daggerconfirmation;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        User user = new User("Daniel", "Malone", "daniel@finepointmobile.com");

        AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();

        long id = db.userDao().insertUser(user);
        List<User> users = db.userDao().getAllUsers();
        Log.d(TAG, "onCreate: size is: " + users.size());
    }
}
