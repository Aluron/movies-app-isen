package com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests;

import com.example.quentin.moviesappisen.TMDB.Constants;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.MovieResult;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.SearchResults.TVResult;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by theo on 07/03/2018.
 */

public class QueryDiscover extends AbstractRequest {
    public final static ArrayList<String> VALID_MOVIE_SORT_BY = new ArrayList<String>(Arrays.asList(new String[]{
            "popularity.asc",
            "popularity.desc",
            "release_date.asc",
            "release_date.desc",
            "revenue.asc",
            "revenue.desc",
            "primary_release_date.asc",
            "primary_release_date.desc",
            "original_title.asc",
            "original_title.desc",
            "vote_average.asc",
            "vote_average.desc",
            "vote_count.asc",
            "vote_count.desc"
    }));

    public final static ArrayList<String> VALID_TV_SORT_BY = new ArrayList<String>(Arrays.asList(new String[]{
            "popularity.asc",
            "popularity.desc",
            "vote_average.asc",
            "vote_average.desc",
            "first_air_date.asc",
            "first_air_date.desc"
    }));


    public String language = null;
    public Integer page = null;
    private onDiscoverResultReceived mListener;

    /**
     * send queries to TMDB API to get discover pages, like trending Movies or TV Shows
     * @param listener  must be a class with onDiscoverResultReceived implemented to get back results
     */
    public QueryDiscover(onDiscoverResultReceived listener) {
        mListener = listener;
    }

    /**
     * sends request to TMDB APi to get discover pages on movies
     * @param sort_by   must be a valid sorting option (see static VALID_MOVIE_SORT_BY) or null (default 'popularity.desc')
     * @param language  must be a valid language or null (default en-US)
     * @param page      must be a positive integer or null (default first page)
     */
    public void getMovieDiscover(String sort_by, String language, Integer page) {
        Type objectAnswerType = MovieResult.class;

        if(sort_by == null)
            sort_by = "popularity.desc";
        if(!VALID_MOVIE_SORT_BY.contains(sort_by.toLowerCase()))
            sort_by = "popularity.desc";    //if not a valid sort rule, sorts by decreasing popularity

        String request = Constants.API_URL +
                "discover/movie?api_key=" + Constants.API_KEY +
                "&sort_by=" + sort_by;

        if(language != null)
            request += "&language=" + language;
        if(page != null)
            request += "&page=" + page.toString();

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();

    }

    /**
     * sends a request to TMDB API to get Discover pages on TV Shows
     * @param sort_by       must be a valid sorting option (see VALID_TV_SORT_BY) or null (default 'popularity.desc')
     * @param language      must be a valid language or null (default is en-US)
     * @param page          must be a positive integer or null (default is first page)
     */
    public void getTVDiscover(String sort_by, String language, Integer page) {
        Type objectAnswerType = TVResult.class;

        if(sort_by == null)
            sort_by = "popularity.desc";

        if(!VALID_TV_SORT_BY.contains(sort_by.toLowerCase()))
            sort_by = "popularity.desc";    //if not a valid sort rule, sorts by decreasing popularity

        String request = Constants.API_URL +
                "discover/tv?api_key=" + Constants.API_KEY +
                "&sort_by=" + sort_by;

        if(language != null)
            request += "&language=" + language;
        if(page != null)
            request += "&page=" + page.toString();

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();

    }

    @Override
    public void onRequestReceived(Object object) {
        switch(object.getClass().getSimpleName()) {
            case    "MovieResult"   :   mListener.onMovieDiscoverReceived(((MovieResult)object).results);   break;
            case    "TVResult"      :   mListener.onTVShowDiscoverReceived(((TVResult)object).results);     break;
        }
    }
}
