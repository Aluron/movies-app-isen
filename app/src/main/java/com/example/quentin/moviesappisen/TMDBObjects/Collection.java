package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Collection {
    private final int id;
    private String name;
    private String overview;
    private String backdrop_path;
    private ArrayList<Movie> parts = new ArrayList<Movie>();

    public Collection(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public ArrayList<Movie> getParts() {
        return parts;
    }

    public void setParts(ArrayList<Movie> parts) {
        this.parts = parts;
    }

    public void addMovie(Movie movie) {
        if(!this.parts.contains((Movie) movie)) {
            this.parts.add(movie);
        }
    }

    public void removeMovie(Movie movie) {
        this.parts.remove(movie);
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
