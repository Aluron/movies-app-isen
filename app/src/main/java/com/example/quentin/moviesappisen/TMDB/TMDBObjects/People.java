package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class People {
    public boolean adult;
    public String biography;
    public String birthday;
    public String deathday;
    public int gender;
    public String homepage;
    public final int id;
    public String imdb_id;
    public String name;
    public String place_of_birth;
    public float popularity;
    public String profile_path;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        People people = (People) o;

        return id == people.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "People{" +
                "adult=" + adult +
                ", biography='" + biography + '\'' +
                ", birthday='" + birthday + '\'' +
                ", deathday='" + deathday + '\'' +
                ", gender=" + gender +
                ", homepage='" + homepage + '\'' +
                ", id=" + id +
                ", imdb_id='" + imdb_id + '\'' +
                ", name='" + name + '\'' +
                ", place_of_birth='" + place_of_birth + '\'' +
                ", popularity=" + popularity +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
