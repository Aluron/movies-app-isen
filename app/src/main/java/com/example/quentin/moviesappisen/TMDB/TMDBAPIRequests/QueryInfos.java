package com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests;

import android.util.Log;

import com.example.quentin.moviesappisen.TMDB.Constants;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Configurations.Configuration;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Episode;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Season;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.TVShow;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

import java.lang.reflect.Type;

/**
 * Created by theo on 05/03/2018.
 */


public class QueryInfos extends AbstractRequest{

    private onObjectReceived mListener;

    /**
     * sends queries to TMDB API on a specific object (Movie, TVShow, season...)
     * @param listener  must be a class with onObjectReceived implemented to get back results
     */
    public QueryInfos(onObjectReceived listener) {
        mListener = listener;
    }

    /**
     * send a request to TMDB API to get current configuration
     * configuration contains valid images formats and the list of change keys
     * answer is given by callback to method onConfigurationReceived
     */
    public void getConfiguration() {
        Type objectAnswerType = Configuration.class;
        String request = Constants.API_URL +
                "configuration?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    /**
     * send a request to TMDB API to get details on a movie based on its id
     * @param id    the id must be a positive number
     * answer is given by callback method onMovieReceived, with the Movie object as parameter
     */
    public void getMovieDetails(int id) {
        Type objectAnswerType = Movie.class;
        String request = Constants.API_URL +
                "movie/" + Integer.toString(id) +
                "?api_key=" + Constants.API_KEY
                +"&append_to_response=videos";

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    /**
     * send a request to TMDB API to get datails on a TVShow based on its id
     * @param id    the id must be a positive number
     * answer is given by callback method onTVShowReceived, with the TVShow object as parameter
     */
    public void getTVShowDetails(int id) {
        Type objectAnswerType = TVShow.class;
        String request = Constants.API_URL +
                "tv/" + Integer.toString(id) +
                "?api_key=" + Constants.API_KEY
                +"&append_to_response=videos";

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    /**
     * send a request to TMDB API to get details on a TVShow's season based on the TVShow id and the season number
     * @param tvId      the TVShow id, must be positive
     * @param seasonNumber  the season number, must be positive
     * answer is given by callback method onTVSeasonReceived, with the Season object as parameter
     */
    public void getTVSeasonDetails(int tvId, int seasonNumber) {
        Type objectAnswerType = Season.class;
        String request = Constants.API_URL +
                "tv/" + Integer.toString(tvId) +
                "/season/" + Integer.toString(seasonNumber) +
                "?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    /**
     * send a request to TMDB API to get details on a TVShow's season's episode based on the TVShow id, the season number and the episode number
     * @param tvId      the TVShow id, must be positive
     * @param seasonNumber  the season number, must be positive
     * @param episodeNumber the episode number, must be positive
     * answer is given by callback method onTVEpisodeReceived, with the Episode object as parameter
     */
    public void getTVEpisodeDetails(int tvId, int seasonNumber, int episodeNumber) {
        Type objectAnswerType = Episode.class;
        String request = Constants.API_URL +
                "tv/" + Integer.toString(tvId) +
                "/season/" + Integer.toString(seasonNumber) +
                "/episode/" + Integer.toString(episodeNumber) +
                "?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }


    /**
     * treats the answer given directly by the TMDBAsyncQuery
     * will call the corresponding callback on listener if a valid object is received
     * @param object
     */
    @Override
    public void onRequestReceived(Object object) {
        switch(object.getClass().getSimpleName().toLowerCase()) {
            case "movie"            :   mListener.onMovieReceived((Movie) object);      break;
            case "tvshow"           :   mListener.onTVShowReceived((TVShow) object);    break;
            case "season"           :   mListener.onTVSeasonReceived((Season) object);  break;
            case "episode"          :   mListener.onTVEpisodeReceived((Episode) object);break;
            case "configuration"    :   mListener.onConfigurationReceived();            break;
        }
    }
}
