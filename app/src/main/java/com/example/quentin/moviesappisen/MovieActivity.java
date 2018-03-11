package com.example.quentin.moviesappisen;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.AbstractRequest;
import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.QueryConfigs;
import com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests.QueryInfos;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Episode;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Season;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.TVShow;
import com.example.quentin.moviesappisen.async.DownloadTMDBImageQuery;

import static com.example.quentin.moviesappisen.SearchActivity.MOVIE_ID;

public class MovieActivity extends AppCompatActivity implements AbstractRequest.onObjectReceived {

    private QueryInfos infos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_movie);

        final int id = getIntent().getIntExtra(MOVIE_ID, 0);

        infos = new QueryInfos(this);
        infos.getMovieDetails(id);
    }

    @Override
    public void onMovieReceived(Movie movie) {
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(movie.title);

        TextView year = (TextView) findViewById(R.id.year);
        year.setText(movie.release_date);

        TextView overview = (TextView) findViewById(R.id.overview);
        overview.setText(movie.overview);

        QueryConfigs configs = new QueryConfigs();
        configs.getBasicConfiguration();

        new DownloadTMDBImageQuery(new DownloadTMDBImageQuery.onImageReceived() {
            @Override
            public void processBitmap(Bitmap bitmap) {
                ImageView poster = (ImageView) findViewById(R.id.moviePoster);
                poster.setImageBitmap(bitmap);
            }
        }).execute(movie.poster_path);
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
