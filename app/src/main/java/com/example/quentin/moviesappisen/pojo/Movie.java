package com.example.quentin.moviesappisen.pojo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Remi on 01/03/2018.
 */

@Entity(tableName = "movies")
public class Movie {

    @PrimaryKey(autoGenerate = true)
    public long _ID;

    @ColumnInfo
    public String imdb_id;

    @ColumnInfo
    public String title;

    @ColumnInfo
    public String overview;

    @ColumnInfo
    public float popularity;

    @ColumnInfo
    public String releasedate;

    @ColumnInfo
    public boolean trailer;
}
