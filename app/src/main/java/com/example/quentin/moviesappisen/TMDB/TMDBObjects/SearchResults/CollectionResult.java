package com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults;

import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Collection;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class CollectionResult {

    public int page;
    public int total_results;
    public int total_pages;
    public ArrayList<Collection> results;

    @Override
    public String toString() {
        return "CollectionResult{" +
                "page=" + page +
                ", total_results=" + total_results +
                ", total_pages=" + total_pages +
                ", results=" + results +
                '}';
    }
}
