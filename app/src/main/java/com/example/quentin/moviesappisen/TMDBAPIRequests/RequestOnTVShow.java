package com.example.quentin.moviesappisen.TMDBAPIRequests;

import android.app.Activity;
import android.util.Log;

import com.example.quentin.moviesappisen.MainActivity;
import com.example.quentin.moviesappisen.TMDBObjects.TVShow;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

/**
 * Created by theo on 05/03/2018.
 */

public class RequestOnTVShow extends Request{

    Integer id;
    Activity mListener;

    public RequestOnTVShow(MainActivity activity, int id) {
        mListener = activity;
        this.objectAnswerType = TVShow.class;
        this.id = id;
        query = new TMDBAsyncQuery(this);
    }

    public void getDetails() {
        this.request = "tv/" + id.toString();
        query.execute();
    }



    @Override
    public void onRequestReceived(Object object) {
        Log.d(this.getClass().getSimpleName(), object.toString());
    }
}
