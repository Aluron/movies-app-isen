package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class Network {
    public int id;
    public String name;

    public Network(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Network{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
