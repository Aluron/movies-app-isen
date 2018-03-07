package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 06/03/2018.
 */

public class Country {

    public String iso_3166_1;
    public String english_name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return iso_3166_1 != null ? iso_3166_1.equals(country.iso_3166_1) : country.iso_3166_1 == null;
    }

    @Override
    public int hashCode() {
        return iso_3166_1 != null ? iso_3166_1.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "iso_3166_1='" + iso_3166_1 + '\'' +
                ", english_name='" + english_name + '\'' +
                '}';
    }
}
