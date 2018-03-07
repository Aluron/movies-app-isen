package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class GuestStar {
    public final int id;
    public String name;
    public String credit_id;
    public String character;
    public int order;
    public String profile_path;

    public GuestStar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuestStar guestStar = (GuestStar) o;

        return id == guestStar.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "GuestStar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit_id='" + credit_id + '\'' +
                ", character='" + character + '\'' +
                ", order=" + order +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
