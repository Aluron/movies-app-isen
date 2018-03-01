package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Season {
    private String airDate;
    private int epCount;
    private final int id;
    private String name;
    private String posterPath;
    private int seasonNumber;
    private ArrayList<Episode> episodes = new ArrayList<Episode>();


    public Season(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
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

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
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
}
