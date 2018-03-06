package com.example.quentin.moviesappisen.TMDBAPIRequests;

import android.app.Activity;
import android.util.Log;

import com.example.quentin.moviesappisen.MainActivity;
import com.example.quentin.moviesappisen.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

/**
 * Created by theo on 05/03/2018.
 */

public class RequestOnMovie extends Request {

    Integer id;
    Activity mListener;

    public RequestOnMovie(MainActivity activity, int id) {
        mListener = activity;
        this.objectAnswerType = Movie.class;
        this.id = id;
        query = new TMDBAsyncQuery(this);
    }

    public void getDetails() {
        this.request = "movie/" + id.toString();
        query.execute();
    }



    @Override
    public void onRequestReceived(Object object) {
        Log.d(this.getClass().getSimpleName(), object.toString());
    }
}
