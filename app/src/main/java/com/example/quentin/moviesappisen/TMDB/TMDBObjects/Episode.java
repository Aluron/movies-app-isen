package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Episode {
    public String air_date;
    public int episode_number;
    public String name;
    public String overview;
    public final int id;
    public String production_code;
    public int season_number;
    public String still_path;
    public float vote_average;
    public int vote_count;
    public ArrayList<Crew> crew = new ArrayList<Crew>();
    public ArrayList<GuestStar> guest_stars = new ArrayList<GuestStar>();

    public Episode(int epNumber, int seasonNumber, String name, int id) {
        this.episode_number = epNumber;
        this.season_number = seasonNumber;
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Episode episode = (Episode) o;

        return id == episode.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "air_date='" + air_date + '\'' +
                ", episode_number=" + episode_number +
                ", name='" + name + '\'' +
                ", overview='" + overview + '\'' +
                ", id=" + id +
                ", production_code='" + production_code + '\'' +
                ", season_number=" + season_number +
                ", still_path='" + still_path + '\'' +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                ", crew=" + crew +
                ", guest_stars=" + guest_stars +
                '}';
    }
}
