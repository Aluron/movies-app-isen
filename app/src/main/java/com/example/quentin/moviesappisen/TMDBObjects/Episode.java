package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Episode {
    private String airDate;
    private int epNumber;
    private String name;
    private String overview;
    private int id;
    private String prodCode;
    private int seasonNumber;
    private String stillPath;
    private float voteAverage;
    private int voteCount;
    private ArrayList<Crew> crew = new ArrayList<Crew>();
    private ArrayList<GuestStar> stars = new ArrayList<GuestStar>();

    public Episode(int epNumber, String name, int id) {
        this.epNumber = epNumber;
        this.name = name;
        this.id = id;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public int getEpNumber() {
        return epNumber;
    }

    public void setEpNumber(int epNumber) {
        this.epNumber = epNumber;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getStillPath() {
        return stillPath;
    }

    public void setStillPath(String stillPath) {
        this.stillPath = stillPath;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public ArrayList<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }

    public void addCrew(Crew crew) {
        if(!this.crew.contains((Crew) crew)) {
            this.crew.add(crew);
        }
    }

    public void removeCrew(Crew crew) {
        this.crew.remove((Crew) crew);
    }

    public ArrayList<GuestStar> getStars() {
        return stars;
    }

    public void setStars(ArrayList<GuestStar> stars) {
        this.stars = stars;
    }

    public void addStar(GuestStar star) {
        if(!this.stars.contains((GuestStar) star)) {
            this.stars.add(star);
        }
    }

    public void removeStar(GuestStar star) {
        this.stars.remove((GuestStar) star);
    }
}
