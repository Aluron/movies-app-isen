package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class Timezone {

    public String iso_3166_1;
    public ArrayList<String> zones;

    @Override
    public String toString() {
        return "Timezone{" +
                "iso_3166_1='" + iso_3166_1 + '\'' +
                ", zones=" + zones +
                '}';
    }
}
