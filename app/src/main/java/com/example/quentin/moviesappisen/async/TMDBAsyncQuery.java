package com.example.quentin.moviesappisen.async;

import android.os.AsyncTask;
import android.util.Log;

import com.example.quentin.moviesappisen.MainActivity;
import com.example.quentin.moviesappisen.TMDBAPIRequests.Constants;
import com.example.quentin.moviesappisen.TMDBAPIRequests.Request;
import com.example.quentin.moviesappisen.TMDBObjects.Movie;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by theo on 05/03/2018.
 */

public class TMDBAsyncQuery extends AsyncTask<Void, Void, Object>{

    Request mListener;


    public TMDBAsyncQuery(Request listener){
        mListener = listener;
    }

    @Override
    protected Object doInBackground(Void... Void) {

        String request = mListener.request;
        Class objectAnswerType = mListener.objectAnswerType;

        URL requestUrl;
        HttpURLConnection connection;


        try {
            requestUrl = new URL(Constants.API_URL + request + "?api_key=" + Constants.API_KEY);
            Log.d(this.getClass().getSimpleName(), "request : " + requestUrl.toString());

            connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            Integer responseCode = connection.getResponseCode();
            Log.d(this.getClass().getSimpleName(), "response code : " + responseCode.toString());
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
