package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class Crew {
    public final int id;
    public String creditId;
    public String name;
    public String department;
    public String job;
    public String profile_path;

    public Crew(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Crew crew = (Crew) o;

        return id == crew.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "id=" + id +
                ", creditId='" + creditId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", job='" + job + '\'' +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
