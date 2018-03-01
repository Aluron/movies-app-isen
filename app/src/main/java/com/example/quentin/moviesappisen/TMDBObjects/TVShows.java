package com.example.quentin.moviesappisen.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 01/03/2018.
 */

public class TVShows {
    private String backdropPath;
    private ArrayList<Integer> episodeRuntimes = new ArrayList<Integer>();
    private String firstAirDate;
    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private String homepage;
    private final int id;
    private boolean inProduction;
    private ArrayList<String> languages = new ArrayList<String>();
    private String lastAirDate;
    private String name;
    private ArrayList<TVNetwork> TVNetworks = new ArrayList<TVNetwork>();
    private int numberOfEpisodes;
    private int numberOfSeasons;
    private ArrayList<String> originCountry = new ArrayList<String>();
    private String originalLanguage;
    private String originalName;
    private String overview;
    private float popularity;
    private String posterPath;
    private ArrayList<Season> seasons = new ArrayList<Season>();
    private String status;
    private String type;
    private int voteAverage;
    private int voteCount;


    public TVShows(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public ArrayList<Integer> getEpisodeRuntimes() {
        return episodeRuntimes;
    }

    public void setEpisodeRuntime(int episodeNumber, int seasonNumber, int runtime) {
        if(seasonNumber <= this.seasons.size()) {
            if(episodeNumber <= this.seasons.get(seasonNumber-1).getEpisodes().size()) {
                int epNumber = 0;
                for(int i = 0; i < seasonNumber - 1; i++) {
                    epNumber += this.seasons.get(i).getEpCount();
                }
                epNumber += episodeNumber;
                this.episodeRuntimes.set(epNumber, runtime);
                if(this.seasons.get(seasonNumber).getEpisodes().get(episodeNumber).getRuntime() == 0) {
                    this.seasons.get(seasonNumber).getEpisodes().get(episodeNumber).setRuntime(runtime);
                }
            }
        }
    }

    public String getFirstAirDate() {
        return firstAirDate;
    }

    public void setFirstAirDate(String firstAirDate) {
        this.firstAirDate = firstAirDate;
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

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
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

    public String getLastAirDate() {
        return lastAirDate;
    }

    public void setLastAirDate(String lastAirDate) {
        this.lastAirDate = lastAirDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<TVNetwork> getTVNetworks() {
        return TVNetworks;
    }

    public void setTVNetworks(ArrayList<TVNetwork> tvNetworks) {
        this.TVNetworks = tvNetworks;
    }

    public void addTVNetwork(TVNetwork tvNetwork) {
        if(!this.TVNetworks.contains(tvNetwork)) {
            this.TVNetworks.add(tvNetwork);
        }
    }

    public void removeTVNetwork(TVNetwork tvNetwork) {
        this.TVNetworks.remove(tvNetwork);
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public ArrayList<String> getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(ArrayList<String> originCountry) {
        this.originCountry = originCountry;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
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

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
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

    public int getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(int voteAverage) {
        this.voteAverage = voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVShows tvShows = (TVShows) o;

        return id == tvShows.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
