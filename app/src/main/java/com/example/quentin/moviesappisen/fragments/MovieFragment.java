package com.example.quentin.moviesappisen.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.quentin.moviesappisen.R;
import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.AbstractRequest;
import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.QueryInfos;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Episode;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Season;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.TVShow;

/**
 * Created by Remi on 10/03/2018.
 */

public class MovieFragment extends Fragment implements AbstractRequest.onObjectReceived {
    private QueryInfos infos;
    private Movie movie;

    public MovieFragment() {
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_header, container, false);

        TextView title = (TextView) rootView.findViewById(R.id.textView);
        title.setText(movie.title);

        return rootView;
    }

    @Override
    public void onMovieReceived(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void onTVShowReceived(TVShow tvShow) {

    }

    @Override
    public void onTVSeasonReceived(Season season) {

    }

    @Override
    public void onTVEpisodeReceived(Episode episode) {

    }
}
