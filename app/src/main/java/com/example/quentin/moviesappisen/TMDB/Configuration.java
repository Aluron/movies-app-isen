package com.example.quentin.moviesappisen.TMDB;

import com.example.quentin.moviesappisen.TMDB.TMDBObjects.ConfigurationResults.ImageConfigResults;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Country;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.JobDepartment;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Language;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Timezone;

import java.util.ArrayList;

/**
 * Created by theo on 07/03/2018.
 */

public final class Configuration {

    //TODO get at least once the information on image_sizes (with QueryConfigs.getBasicConfiguration), then store it somewhere in DB to get back at app startup
    public static ImageConfigResults image_sizes;
    public static ArrayList<String> parameters_list = new ArrayList<String>();
    public static ArrayList<Country> countries = new ArrayList<Country>();
    public static ArrayList<JobDepartment> jobs_list = new ArrayList<JobDepartment>();
    public static ArrayList<Language> languages_list = new ArrayList<Language>();
    public static ArrayList<String> translations_list = new ArrayList<String>();
    public static ArrayList<Timezone> timezones_list = new ArrayList<Timezone>();

}
