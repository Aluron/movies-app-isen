package com.example.quentin.moviesappisen.TMDB.TMDBObjects.ConfigurationResults;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class ConfigurationResults {

    public ImageConfigResults images;
    public ArrayList<String> change_keys = new ArrayList<String>();

    @Override
    public String toString() {
        return "ConfigurationResults{" +
                "images=" + images +
                ", change_keys=" + change_keys +
                '}';
    }
}
