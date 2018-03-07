package com.example.quentin.moviesappisen.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quentin.moviesappisen.R;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Movie;

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
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO Set View

        final ViewHolder holder;

        if (null == convertView){
            convertView = mInflater.inflate(R.layout.filmlist_adapter, null);

            holder = new ViewHolder(convertView);

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        final Movie movie = (Movie) getItem(position);

        holder.title.setText(movie.title);
        holder.director.setText(movie.original_title);
        holder.release.setText(movie.release_date);
        // TODO? Add a "favorite" button ?

        /* //TODO: Image Cache
        final Bitmap image = mImageMemoryCache.getBitmapFromMemCache(tweet.user.profileImageUrl);
        if (null == image) {
            new ImageDLAsyncTask(holder.image, mImageMemoryCache).execute(tweet.user.profileImageUrl);
        } else {
            holder.image.setImageBitmap(image);
        }
        */


        return convertView;
    }

    private class ViewHolder {

        public ImageView image;
        public TextView title;
        public TextView director;
        public TextView release;

        public ViewHolder(View view) {
            image = (ImageView) view.findViewById(R.id.film_poster);
            title = (TextView) view.findViewById(R.id.title);
            director = (TextView) view.findViewById(R.id.director);
            release = (TextView) view.findViewById(R.id.year);

        }
    }
}
