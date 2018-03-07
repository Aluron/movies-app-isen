package com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults;

import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class MovieResult {

    public int page;
    public int total_results;
    public int total_pages;
    public ArrayList<Movie> results;

    @Override
    public String toString() {
        return "MovieResult{" +
                "page=" + page +
                ", total_results=" + total_results +
                ", total_pages=" + total_pages +
                ", results=" + results +
                '}';
    }
}
