package com.example.quentin.moviesappisen;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.quentin.moviesappisen.database.AppDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "misenadb").build();

        setContentView(R.layout.activity_main);
    }
}
