package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class TVShow {
    public String backdrop_path;
    public ArrayList<People> created_by = new ArrayList<People>();
    public ArrayList<Integer> episode_run_time = new ArrayList<Integer>();
    public String first_air_date;
    public ArrayList<Genre> genres = new ArrayList<Genre>();
    public String homepage;
    public final int id;
    public boolean in_production;
    public ArrayList<String> languages = new ArrayList<String>();
    public String last_air_date;
    public String name;
    public ArrayList<TVNetwork> networks = new ArrayList<TVNetwork>();
    public int number_of_episodes;
    public int number_of_seasons;
    public ArrayList<String> origin_country = new ArrayList<String>();
    public String original_language;
    public String original_name;
    public String overview;
    public float popularity;
    public String poster_path;
    public ArrayList<Company> production_companies = new ArrayList<Company>();
    public ArrayList<Season> seasons = new ArrayList<Season>();
    public String status;
    public String type;
    public float vote_average;
    public int vote_count;


    public TVShow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVShow tvShows = (TVShow) o;

        return id == tvShows.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "backdrop_path='" + backdrop_path + '\'' +
                ", created_by=" + created_by +
                ", episode_run_time=" + episode_run_time +
                ", first_air_date='" + first_air_date + '\'' +
                ", genres=" + genres +
                ", homepage='" + homepage + '\'' +
                ", id=" + id +
                ", in_production=" + in_production +
                ", languages=" + languages +
                ", last_air_date='" + last_air_date + '\'' +
                ", name='" + name + '\'' +
                ", networks=" + networks +
                ", number_of_episodes=" + number_of_episodes +
                ", number_of_seasons=" + number_of_seasons +
                ", origin_country=" + origin_country +
                ", original_language='" + original_language + '\'' +
                ", original_name='" + original_name + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", poster_path='" + poster_path + '\'' +
                ", production_companies=" + production_companies +
                ", seasons=" + seasons +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                '}';
    }
}
