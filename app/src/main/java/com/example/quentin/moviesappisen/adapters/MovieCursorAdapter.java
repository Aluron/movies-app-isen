package com.example.quentin.moviesappisen.adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

import com.example.quentin.moviesappisen.R;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;
import com.example.quentin.moviesappisen.database.DBContract;

/**
 * Created by Remi on 08/03/2018.
 */

public class MovieCursorAdapter extends CursorAdapter {
    public MovieCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        final View view = LayoutInflater.from(context).inflate(R.layout.filmlist_adapter, null);

        final ViewHolder holder = new ViewHolder(view);

        view.setTag(holder);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        final ViewHolder holder = (ViewHolder) view.getTag();

        final Movie movie = DBContract.movieFromCursor(cursor);

        holder.title.setText(movie.title);
        holder.year.setText(movie.release_date);
    }
}
