package com.example.quentin.moviesappisen.TMDB.TMDBObjects.ConfigurationResults;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class ImageConfigResults {

    public String base_url;
    public String secure_base_url;
    public ArrayList<String> backdrop_sizes = new ArrayList<String>();
    public ArrayList<String> logo_sizes = new ArrayList<String>();
    public ArrayList<String> poster_sizes = new ArrayList<String>();
    public ArrayList<String> profile_sizes = new ArrayList<String>();
    public ArrayList<String> still_sizes = new ArrayList<String>();

    @Override
    public String toString() {
        return "images{" +
                "base_url='" + base_url + '\'' +
                ", secure_base_url='" + secure_base_url + '\'' +
                ", backdrop_sizes=" + backdrop_sizes +
                ", logo_sizes=" + logo_sizes +
                ", poster_sizes=" + poster_sizes +
                ", profile_sizes=" + profile_sizes +
                ", still_sizes=" + still_sizes +
                '}';
    }
}
