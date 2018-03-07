package com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests;

import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Collection;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Episode;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.People;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Season;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.TVShow;

import java.util.ArrayList;

/**
 * Created by theo on 05/03/2018.
 */

public abstract class AbstractRequest {


    /**
     * this interface must be implemented in the class which creates a QueryInfos instance to get answer from query
     */
    public interface onObjectReceived {
        public void onMovieReceived(Movie movie);
        public void onTVShowReceived(TVShow tvShow);
        public void onTVSeasonReceived(Season season);
        public void onTVEpisodeReceived(Episode episode);
    }


    /**
     * this interface must be implemented in the class which creates a QuerySearch instance to get answer from query
     */
    public interface onSearchResultReceived {
        public void onCollectionListReceived(ArrayList<Collection> collections);
        public void onMovieListReceived(ArrayList<Movie> movies);
        public void onPeopleListReceived(ArrayList<People> persons);
        public void onTVShowListReceived(ArrayList<TVShow> tvShows);
    }

    /**
     * this interface must be implemented in the class which creates a QueryDiscover instance to get answer from query
     */
    public interface onDiscoverResultReceived {
        public void onMovieDiscoverReceived(ArrayList<Movie> movies);
        public void onTVShowDiscoverReceived(ArrayList<TVShow> tvShows);
    }


    public abstract void onRequestReceived(Object object);


}
