package com.example.quentin.moviesappisen.async;

import android.os.AsyncTask;
import android.util.Log;

import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.AbstractRequest;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by theo on 05/03/2018.
 */

public class TMDBAsyncQuery extends AsyncTask<Void, Void, Object>{

    AbstractRequest mListener;
    String request;
    Type objectAnswerType;



    public TMDBAsyncQuery(AbstractRequest listener, String request, Type objectAnswerType){
        mListener = listener;
        this.request = request;
        this.objectAnswerType = objectAnswerType;

    }


    @Override
    protected Object doInBackground(Void... Void) {

        URL requestUrl;
        HttpURLConnection connection;


        try {
            requestUrl = new URL(request);
            Log.d(this.getClass().getSimpleName(), "request : " + requestUrl.toString());

            connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            int responseCode = connection.getResponseCode();
            Log.d(this.getClass().getSimpleName(), "response code : " + Integer.toString(responseCode));
            if(responseCode == 200) {
                return new Gson().fromJson(new InputStreamReader(connection.getInputStream(), "UTF-8"), objectAnswerType);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Object object) {
        if(object != null)
            mListener.onRequestReceived(object);
    }
}
