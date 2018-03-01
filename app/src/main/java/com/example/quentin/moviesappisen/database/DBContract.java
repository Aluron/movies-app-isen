package com.example.quentin.moviesappisen.database;

import static android.provider.BaseColumns._ID;

/**
 * Created by Remi on 01/03/2018.
 */

public class DBContract {

    public static final String MOVIES_TABLE_NAME = "movies";
    public static final String TVSHOWS_TABLE_NAME = "tv_shows";

    public static final String COLUMN_ID = _ID;
    public static final String COLUMN_IMDB_ID = "imdb_id";
    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_OVERVIEW = "overview";
    public static final String COLUMN_POPULARITY = "popularity";
    public static final String COLUMN_RELEASE_DATE = "release_date";
    public static final String COLUMN_TRAILER = "trailer";
}
