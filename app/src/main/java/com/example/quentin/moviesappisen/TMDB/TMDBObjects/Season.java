package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Season {
    public String air_date;
    public final int id;
    public String name;
    public String overview;
    public String poster_path;
    public int season_number;
    public ArrayList<Episode> episodes = new ArrayList<Episode>();


    public Season(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Season season = (Season) o;

        return id == season.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


    @Override
    public String toString() {
        return "Season{" +
                "air_date='" + air_date + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", overview='" + overview + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", season_number=" + season_number +
                ", episodes=" + episodes +
                '}';
    }
}
