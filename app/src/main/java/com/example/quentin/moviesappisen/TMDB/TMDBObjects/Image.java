package com.example.quentin.moviesappisen.TMDB.TMDBObjects;


/**
 * Created by theo on 06/03/2018.
 */

public class Image {

    public float aspect_ratio;
    public String file_path;
    public int height;
    public String iso_639_1;
    public int vote_average;
    public int vote_count;
    public int width;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Image image = (Image) o;

        return file_path != null ? file_path.equals(image.file_path) : image.file_path == null;
    }

    @Override
    public int hashCode() {
        return file_path != null ? file_path.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Image{" +
                "aspect_ratio=" + aspect_ratio +
                ", file_path='" + file_path + '\'' +
                ", height=" + height +
                ", iso_639_1='" + iso_639_1 + '\'' +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                ", width=" + width +
                '}';
    }
}
