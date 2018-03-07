package com.example.quentin.moviesappisen.TMDB.TMDBAPIRequests;

import android.accounts.AccountAuthenticatorResponse;
import android.util.Log;

import com.example.quentin.moviesappisen.TMDB.Configuration;
import com.example.quentin.moviesappisen.TMDB.Constants;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.ConfigurationResults.ConfigurationResults;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Country;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.JobDepartment;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Language;
import com.example.quentin.moviesappisen.TMDB.TMDBObjects.Timezone;
import com.example.quentin.moviesappisen.async.TMDBAsyncQuery;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by theo on 07/03/2018.
 */

public class QueryConfigs extends AbstractRequest {



    public void getAllConfigs() {
        getBasicConfiguration();
        getCountries();
        getJobs();
        getLanguages();
        getTranslations();
        getTimezones();
    }


    /**
     * send a request to TMDB API to update current configuration profile
     * configuration contains valid images formats and the list of change keys
     * no callback from this method, as the configuration final class is updated directly
     */
    public void getBasicConfiguration() {
        Type objectAnswerType = ConfigurationResults.class;
        String request = Constants.API_URL +
                "configuration?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    public void getCountries() {
        Type objectAnswerType = new TypeToken<ArrayList<Country>>() {}.getType();
        String request = Constants.API_URL +
                "configuration/countries?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    public void getJobs() {
        Type objectAnswerType = new TypeToken<ArrayList<JobDepartment>>() {}.getType();
        String request = Constants.API_URL +
                "configuration/jobs?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    public void getLanguages() {
        Type objectAnswerType = new TypeToken<ArrayList<Language>>() {}.getType();
        String request = Constants.API_URL +
                "configuration/languages?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    public void getTranslations() {
        Type objectAnswerType = new TypeToken<ArrayList<String>>() {}.getType();
        String request = Constants.API_URL +
                "configuration/primary_translations?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    public void getTimezones() {
        Type objectAnswerType = new TypeToken<ArrayList<Timezone>>() {}.getType();
        String request = Constants.API_URL +
                "configuration/timezones?api_key=" + Constants.API_KEY;

        TMDBAsyncQuery query = new TMDBAsyncQuery(this, request, objectAnswerType);

        query.execute();
    }

    @Override
    public void onRequestReceived(Object object) {

        if(object instanceof ConfigurationResults) {
            ConfigurationResults conf = (ConfigurationResults) object;
            Configuration.image_sizes = conf.images;
            Configuration.parameters_list = conf.change_keys;

            Log.d(this.getClass().getSimpleName(), Configuration.image_sizes.toString());
            Log.d(this.getClass().getSimpleName(), Configuration.parameters_list.toString());
        }

        if(object instanceof ArrayList) {
            if(((ArrayList) object).get(0) instanceof Country) {
                Configuration.countries = (ArrayList<Country>)object;
                Log.d(this.getClass().getSimpleName(), "current available countries : " + Configuration.countries.toString());
            }

            if(((ArrayList) object).get(0) instanceof JobDepartment) {
                Configuration.jobs_list = (ArrayList<JobDepartment>) object;
                Log.d(this.getClass().getSimpleName(), "current available jobs : " + Configuration.jobs_list.toString());
            }

            if(((ArrayList) object).get(0) instanceof Language) {
                Configuration.languages_list = (ArrayList<Language>) object;
                Log.d(this.getClass().getSimpleName(), "current available languages : " + Configuration.languages_list.toString());
            }

            if(((ArrayList) object).get(0) instanceof String) {
                Configuration.translations_list = (ArrayList<String>) object;
                Log.d(this.getClass().getSimpleName(), "current available translations : " + Configuration.translations_list.toString());
            }

            if(((ArrayList) object).get(0) instanceof Timezone) {
                Configuration.timezones_list = (ArrayList<Timezone>) object;
                Log.d(this.getClass().getSimpleName(), "current available timezones : " + Configuration.timezones_list.toString());
            }
        }


    }
}
