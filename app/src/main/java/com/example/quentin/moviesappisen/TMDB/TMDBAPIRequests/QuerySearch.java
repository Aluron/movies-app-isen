package com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests;


import android.util.Log;

import com.example.quentin.moviesappisen.TMDB.Configuration;
import com.example.quentin.moviesappisen.TMDB.Constants;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.CollectionResult;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.MovieResult;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.PeopleResult;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.TVResult;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;

/**
 * Created by theo on 06/03/2018.
 */

public class QuerySearch extends AbstractRequest {

    private onSearchResultReceived mListener;

    /**
     * sends a search query to TMDB API for specific TMDB objects
     * @param listener  must be a class with onSearchResultReceived implemented to get back results
     */
    public QuerySearch(onSearchResultReceived listener) {
        mListener = listener;
    }

    /**
     * sends a request to TMDB API to search for collections
     * @param searchQuery   the search query to be made, must not be null
     * @param language      must be a valid string or null
     * @param page          must be a positive integer of null
     * answer will be given with callback method onCollectionListReceived with an ArrayList of Collections as parameter
     */
    public void searchCollections(String searchQuery, String language, Integer page) {
        Type objectAnswerType = CollectionResult.class;
        String request;
        try {
            request = Constants.API_URL +
                    "search/collection?api_key=" + Constants.API_KEY +
                    "&query=" + URLEncoder.encode(searchQuery, "UTF-8");
            if(language != null)
                if(!Configuration.languages_list.isEmpty())
                    if(Configuration.languages_list.contains(language))
                        request += "&language=" + language;
            if(page != null)
                request += "&page=" + page.toString();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);
        query.execute();
    }

    /**
     * sends a request to TMDB API to search for movies
     * @param searchQuery           the search query, must not be null
     * @param include_adult         parameter to include adult content, must be true or false
     * @param language              must be a valid string or null
     * @param region                must be a valid string or null
     * @param year                  must be a positive integer or null
     * @param primary_release_year  must be a positive integer or null
     * @param page                  must be a positive integer or null
     * answer will be given with callback method onMovieListReceived with an ArrayList of Movie as parameter
     */
    public void searchMovies(String searchQuery, boolean include_adult, String language, String region, Integer year, Integer primary_release_year, Integer page) {
        Type objectAnswerType = MovieResult.class;
        String request;
        try {
            request = Constants.API_URL +
                    "search/movie?api_key=" + Constants.API_KEY +
                    "&query=" + URLEncoder.encode(searchQuery, "UTF-8");
            if(page != null)
                request += "&page=" + page.toString();
            if(language != null)
                if(!Configuration.languages_list.isEmpty())
                    if(Configuration.languages_list.contains(language))
                        request += "&language=" + language;
            if(include_adult)
                request += "&include_adult=true";
            if(region != null)
                if(!Configuration.timezones_list.isEmpty())
                    if(Configuration.timezones_list.contains(region))
                        request += "&region=" + region;
            if(year != null)
                request += "&year=" + year.toString();
            if(primary_release_year != null)
                request += "&primary_release_year" + primary_release_year.toString();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);
        query.execute();
    }

    /**
     * sends a request to TMDB API to search for People
     * @param searchQuery       the search query, must not be null
     * @param include_adult     boolean true or false
     * @param language          must be a valid string or null
     * @param page              must be a positive integer or null
     * @param region            must be a valid string or null
     * answer will be given with callback method onPeopleListReceived wit han ArrayList of People as parameter
     */
    public void searchPeople(String searchQuery, boolean include_adult, String language, Integer page, String region) {
        Type objectAnswerType = PeopleResult.class;
        String request;
        try {
            request = Constants.API_URL +
                    "search/person?api_key=" + Constants.API_KEY +
                    "&query=" + URLEncoder.encode(searchQuery, "UTF-8");
            if(language != null)
                if(!Configuration.languages_list.isEmpty())
                    if(Configuration.languages_list.contains(language))
                        request += "&language=" + language;
            if(page != null)
                request += "&page=" + page.toString();
            if(include_adult)
                request += "&include_adult=true";
            if(region != null)
                if(!Configuration.timezones_list.isEmpty())
                    if(Configuration.timezones_list.contains(region))
                        request += "&region=" + region;

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);
        query.execute();
    }

    /**
     * sends a request to TMDB API to search for TVShows
     * @param searchQuery       the search query, must not be null
     * @param language          must be a valid string or null
     * @param page              must be a positive integer or null
     * @param first_air_date    must be a positive integer or null
     * answer will be given with callback method onTVShowListReceived with an ArrayList of TVShow as parameter
     */
    public void searchTVShows(String searchQuery, String language, Integer page, Integer first_air_date) {
        Type objectAnswerType = TVResult.class;
        String request;
        try {
            request = Constants.API_URL +
                    "search/tv?api_key=" + Constants.API_KEY +
                    "&query=" + URLEncoder.encode(searchQuery, "UTF-8");
            if(language != null)
                if(!Configuration.languages_list.isEmpty())
                    if(Configuration.languages_list.contains(language))
                        request += "&language=" + language;
            if(page != null)
                request += "&page=" + page.toString();
            if(first_air_date != null)
                request += "&first_air_date=" + first_air_date.toString();

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);
        query.execute();
    }

    /**
     * treats the answer given directly by TMDBAsyncQuery
     * will call the corresponding callback on listener if a valid object is received
     * @param object
     * at the moment, the callbacks don't get the full result objects but just the ArrayList,
     * meaning there is no knowledge of the number of pages and the current page being returned
     */
    @Override
    public void onRequestReceived(Object object) {
        switch(object.getClass().getSimpleName()) {
            case "CollectionResult"     :   mListener.onCollectionListReceived(((CollectionResult)object).results); break;
            case "MovieResult"          :   mListener.onMovieListReceived(((MovieResult)object).results);           break;
            case "PeopleResult"         :   mListener.onPeopleListReceived(((PeopleResult)object).results);         break;
            case "TVResult"             :   mListener.onTVShowListReceived(((TVResult)object).results);             break;
        }
    }
}
