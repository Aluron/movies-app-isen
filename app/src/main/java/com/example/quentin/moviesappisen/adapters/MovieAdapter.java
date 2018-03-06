package com.example.quentin.moviesappisen.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quentin.moviesappisen.R;
import com.example.quentin.moviesappisen.pojo.Movie;

import java.util.List;

/**
 * Created by Remi on 06/03/2018.
 */

public class MovieAdapter extends BaseAdapter {
    private List<Movie> mMovies;
    LayoutInflater mInflater;
    Context context;

    public MovieAdapter(List<Movie> movies, Context context) {
        mMovies = movies;

        mInflater = LayoutInflater.from(context);

        this.context = context;
    }

    @Override
    public int getCount() {
        return null != mMovies ? mMovies.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return null != mMovies ? mMovies.get(i) : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //TODO Set View

        final ViewHolder holder;

        return null;
    }

    private class ViewHolder {

        public ViewHolder(View view) {

        }
    }
}
