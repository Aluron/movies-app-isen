package com.example.quentin.moviesappisen.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.quentin.moviesappisen.R;

/**
 * Created by Remi on 08/03/2018.
 */

public class ViewHolder {
    public ImageView poster;
    public TextView title;
    public TextView year;

    public ViewHolder(View view) {
        poster = (ImageView) view.findViewById(R.id.film_poster);
        title = (TextView) view.findViewById(R.id.movieTitle);
        year = (TextView) view.findViewById(R.id.year);
    }
}
