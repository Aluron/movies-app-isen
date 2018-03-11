package com.example.quentin.moviesappisen.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.quentin.moviesappisen.R;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.async.DownloadTMDBImageQuery;

import java.util.ArrayList;

/**
 * Created by Remi on 10/03/2018.
 */

public class MovieAdapter extends BaseAdapter {
    private ArrayList<Movie> movies;
    private LayoutInflater mInflater;

    public MovieAdapter(ArrayList<Movie> movies, Context context) {
        this.movies = movies;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return null != movies ? movies.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return null != movies ? movies.get(i) : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if(null == view){
            view = mInflater.inflate(R.layout.filmlist_adapter, null);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        else{
            holder = (ViewHolder) view.getTag();
        }

        final Movie movie = (Movie) getItem(i);

        holder.title.setText(movie.title);
        holder.year.setText(movie.release_date);

        /* DownloadTMDBImageQuery imageQuery = new DownloadTMDBImageQuery(new DownloadTMDBImageQuery.onImageReceived() {
            @Override
            public void processBitmap(Bitmap bitmap) {
                holder.poster.setImageBitmap(bitmap);
            }
        });
        imageQuery.execute("/" + movie.poster_path + ".png"); */

        return view;
    }
}
