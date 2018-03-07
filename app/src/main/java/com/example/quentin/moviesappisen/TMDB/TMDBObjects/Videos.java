package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by theo on 07/03/2018.
 */

public class Videos {

    @SerializedName("results")
    public ArrayList<Video> videos = new ArrayList<Video>();

    @Override
    public String toString() {
        return "Videos{" +
                "videos=" + videos +
                '}';
    }
}
