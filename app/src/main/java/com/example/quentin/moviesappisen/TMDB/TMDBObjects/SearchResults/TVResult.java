package com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults;

import com.example.quentin.moviesappisen.TMDB.TMDBObjects.TVShow;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class TVResult {

    public int page;
    public int total_results;
    public int total_pages;
    public ArrayList<TVShow> results;

    @Override
    public String toString() {
        return "TVResult{" +
                "page=" + page +
                ", total_results=" + total_results +
                ", total_pages=" + total_pages +
                ", results=" + results +
                '}';
    }
}
