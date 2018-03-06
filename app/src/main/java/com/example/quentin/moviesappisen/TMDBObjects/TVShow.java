package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class TVShow {
    private String backdrop_path;
    private ArrayList<Integer> episode_run_time = new ArrayList<Integer>();
    private String first_air_date;
    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private String homepage;
    private final int id;
    private boolean in_production;
    private ArrayList<String> languages = new ArrayList<String>();
    private String last_air_date;
    private String name;
    private ArrayList<TVNetwork> networks = new ArrayList<TVNetwork>();
    private int number_of_episodes;
    private int number_of_seasons;
    private ArrayList<String> origin_country = new ArrayList<String>();
    private String original_language;
    private String original_name;
    private String overview;
    private float popularity;
    private String poster_path;
    private ArrayList<Season> seasons = new ArrayList<Season>();
    private String status;
    private String type;
    private float vote_average;
    private int vote_count;


    public TVShow(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public ArrayList<Integer> getEpisode_run_time() {
        return episode_run_time;
    }

    public void setEpisodeRuntime(int episodeNumber, int seasonNumber, int runtime) {
        if(seasonNumber <= this.seasons.size()) {
            if(episodeNumber <= this.seasons.get(seasonNumber-1).getEpisodes().size()) {
                int epNumber = 0;
                for(int i = 0; i < seasonNumber - 1; i++) {
                    epNumber += this.seasons.get(i).getEpCount();
                }
                epNumber += episodeNumber;
                this.episode_run_time.set(epNumber, runtime);
                if(this.seasons.get(seasonNumber).getEpisodes().get(episodeNumber).getRuntime() == 0) {
                    this.seasons.get(seasonNumber).getEpisodes().get(episodeNumber).setRuntime(runtime);
                }
            }
        }
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public void addGenre(Genre genre) {
        if(!this.genres.contains((Genre) genre)) {
            this.genres.add(genre);
        }
    }

    public void removeGenre(Genre genre) {
        this.genres.remove(genre);
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public int getId() {
        return id;
    }

    public boolean isIn_production() {
        return in_production;
    }

    public void setIn_production(boolean in_production) {
        this.in_production = in_production;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public void addLanguage(String language) {
        if(!this.languages.contains((String) language)) {
            this.languages.add(language);
        }
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String getLast_air_date() {
        return last_air_date;
    }

    public void setLast_air_date(String last_air_date) {
        this.last_air_date = last_air_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TVNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<TVNetwork> tvNetworks) {
        this.networks = tvNetworks;
    }

    public void addTVNetwork(TVNetwork tvNetwork) {
        if(!this.networks.contains(tvNetwork)) {
            this.networks.add(tvNetwork);
        }
    }

    public void removeTVNetwork(TVNetwork tvNetwork) {
        this.networks.remove(tvNetwork);
    }

    public int getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(int number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    public int getNumber_of_seasons() {
        return number_of_seasons;
    }

    public void setNumber_of_seasons(int number_of_seasons) {
        this.number_of_seasons = number_of_seasons;
    }

    public ArrayList<String> getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(ArrayList<String> origin_country) {
        this.origin_country = origin_country;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(ArrayList<Season> seasons) {
        this.seasons = seasons;
    }

    public void addSeason(Season season) {
        if(!this.seasons.contains((Season) season)) {
            this.seasons.add(season);
        }
    }

    public void removeSeason(Season season) {
        this.seasons.remove(season);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVShow tvShows = (TVShow) o;

        return id == tvShows.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "TVShow{" +
                "backdrop_path='" + backdrop_path + '\'' +
                ", episode_run_time=" + episode_run_time +
                ", first_air_date='" + first_air_date + '\'' +
                ", genres=" + genres +
                ", homepage='" + homepage + '\'' +
                ", id=" + id +
                ", in_production=" + in_production +
                ", languages=" + languages +
                ", last_air_date='" + last_air_date + '\'' +
                ", name='" + name + '\'' +
                ", networks=" + networks +
                ", number_of_episodes=" + number_of_episodes +
                ", number_of_seasons=" + number_of_seasons +
                ", origin_country=" + origin_country +
                ", original_language='" + original_language + '\'' +
                ", original_name='" + original_name + '\'' +
                ", overview='" + overview + '\'' +
                ", popularity=" + popularity +
                ", poster_path='" + poster_path + '\'' +
                ", seasons=" + seasons +
                ", status='" + status + '\'' +
                ", type='" + type + '\'' +
                ", vote_average=" + vote_average +
                ", vote_count=" + vote_count +
                '}';
    }
}
