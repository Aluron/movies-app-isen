package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class Episode {
    private String air_date;
    private int episode_number;
    private String name;
    private String overview;
    private final int id;
    private String production_code;
    private int runtime;
    private int season_number;
    private String still_path;
    private float vote_average;
    private int vote_count;
    private ArrayList<Crew> crew = new ArrayList<Crew>();
    private ArrayList<GuestStar> guest_stars = new ArrayList<GuestStar>();

    public Episode(int epNumber, int seasonNumber, String name, int id) {
        this.episode_number = epNumber;
        this.season_number = seasonNumber;
        this.name = name;
        this.id = id;
    }

    public String getAir_date() {
        return air_date;
    }

    public void setAir_date(String air_date) {
        this.air_date = air_date;
    }

    public int getEpisode_number() {
        return episode_number;
    }

    public void setEpisode_number(int episode_number) {
        this.episode_number = episode_number;
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

    public String getProduction_code() {
        return production_code;
    }

    public void setProduction_code(String production_code) {
        this.production_code = production_code;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getSeason_number() {
        return season_number;
    }

    public void setSeason_number(int season_number) {
        this.season_number = season_number;
    }

    public String getStill_path() {
        return still_path;
    }

    public void setStill_path(String still_path) {
        this.still_path = still_path;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
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

    public ArrayList<GuestStar> getGuest_stars() {
        return guest_stars;
    }

    public void setGuest_stars(ArrayList<GuestStar> guest_stars) {
        this.guest_stars = guest_stars;
    }

    public void addStar(GuestStar star) {
        if(!this.guest_stars.contains((GuestStar) star)) {
            this.guest_stars.add(star);
        }
    }

    public void removeStar(GuestStar star) {
        this.guest_stars.remove((GuestStar) star);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Episode episode = (Episode) o;

        return id == episode.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "air_date='" + air_date + '\'' +
                ", episode_number=" + episode_number +
                ", name='" + name + '\'' +
                ", overview='" + overview + '\'' +
                ", id=" + id +
                ", production_code='" + production_code + '\'' +
                ", runtime=" + runtime +
                ", season_number=" + season_number +
                ", still_path='" + still_path + '\'' +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                ", crew=" + crew +
                ", guest_stars=" + guest_stars +
                '}';
    }
}
