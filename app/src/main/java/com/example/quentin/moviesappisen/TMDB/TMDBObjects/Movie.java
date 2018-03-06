package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Movie {
    public boolean adult;
    public String backdrop_path;
    public Collection belongs_to_collection;
    public Long budget;
    public ArrayList<Genre> genres = new ArrayList<Genre>();
    public String homepage;
    public final int id;
    public ArrayList<Country> production_countries = new ArrayList<Country>();
    public String imdb_id;
    public String original_language;
    public String original_title;
    public String overview;
    public float popularity;
    public String poster_path;
    public ArrayList<Company> production_companies = new ArrayList<Company>();
    public String release_date;
    public Long revenue;
    public int runtime;
    public Language spoken_languages;
    public String status;
    public String tagline;
    public String title;
    public boolean video;
    public float vote_average;
    public float vote_count;


    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "adult=" + adult +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", belongs_to_collection=" + belongs_to_collection +
                ", budget=" + budget +
                ", genres=" + genres +
                ", homepage='" + homepage + '\'' +
                ", id=" + id +
                ", production_countries=" + production_countries +
                ", imdb_id='" + imdb_id + '\'' +
                ", original_language='" + original_language + '\'' +
                ", original_title='" + original_title + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", poster_path='" + poster_path + '\'' +
                ", production_companies=" + production_companies +
                ", release_date='" + release_date + '\'' +
                ", revenue=" + revenue +
                ", runtime=" + runtime +
                ", spoken_languages=" + spoken_languages +
                ", status='" + status + '\'' +
                ", tagline='" + tagline + '\'' +
                ", title='" + title + '\'' +
                ", video=" + video +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                '}';
    }
}
