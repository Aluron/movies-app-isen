package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

/**
 * Created by theo on 06/03/2018.
 */

public class Language {

    public String iso_639_1;
    public String english_name;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Language language = (Language) o;

        return iso_639_1 != null ? iso_639_1.equals(language.iso_639_1) : language.iso_639_1 == null;
    }

    @Override
    public int hashCode() {
        return iso_639_1 != null ? iso_639_1.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Language{" +
                "iso_639_1='" + iso_639_1 + '\'' +
                ", english_name='" + english_name + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
