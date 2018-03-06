package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Season {
    private String air_date;
    private int epCount;
    private final int id;
    private String name;
    private String poster_path;
    private int season_number;
    private ArrayList<Episode> episodes = new ArrayList<Episode>();


    public Season(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getAir_date() {
        return air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public int getEpCount() {
        return epCount;
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

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public int getSeason_number() {
        return season_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
        this.epCount = episodes.size();
    }

    public void addEpisode(Episode episode) {
        if(!this.episodes.contains((Episode) episode)) {
            this.episodes.add(episode);
            this.epCount++;
        }
    }

    public void removeEpisode(Episode episode) {
        if(this.episodes.remove((Episode) episode)) {
            this.epCount--;
        }
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
                ", epCount=" + epCount +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", season_number=" + season_number +
                ", episodes=" + episodes +
                '}';
    }
}
