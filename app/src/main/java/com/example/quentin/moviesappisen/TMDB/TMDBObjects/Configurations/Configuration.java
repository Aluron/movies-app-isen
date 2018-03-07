package com.example.quentin.moviesappisen.TMDB.TMDBObjects.Configurations;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public final class Configuration {

    ImageConfigs images;
    ArrayList<String> change_keys = new ArrayList<String>();

    @Override
    public String toString() {
        return "Configuration{" +
                "images=" + images +
                ", change_keys=" + change_keys +
                '}';
    }
}
