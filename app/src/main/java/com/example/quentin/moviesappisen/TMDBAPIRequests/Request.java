package com.example.quentin.moviesappisen.TMDBAPIRequests;

import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

/**
 * Created by theo on 05/03/2018.
 */

public abstract class Request {

    public String request;
    public Class objectAnswerType;
    TMDBAsyncQuery query;

    public abstract void onRequestReceived(Object object);


}
