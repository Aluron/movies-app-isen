package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Collection {
    public final int id;
    public String name;
    public String overview;
    public String backdrop_path;
    public ArrayList<Movie> parts = new ArrayList<Movie>();

    public Collection(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collection that = (Collection) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", overview='" + overview + '\'' +
                ", backdrop_path='" + backdrop_path + '\'' +
                ", parts=" + parts +
                '}';
    }
}
