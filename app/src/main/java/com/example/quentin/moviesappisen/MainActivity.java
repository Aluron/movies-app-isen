package com.example.quentin.moviesappisen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.quentin.moviesappisen.TMDBAPIRequests.RequestOnMovie;
import com.example.quentin.moviesappisen.TMDBAPIRequests.RequestOnTVShow;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestOnTVShow request = new RequestOnTVShow(this, 456);
        request.getDetails();
    }

    public void onRequestReceived(Object object) {
        if(object != null) {
            Log.d(this.getClass().getSimpleName(), object.toString());
        }
    }
}
