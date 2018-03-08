package com.example.quentin.moviesappisen.TMDB.TMDBObjects;

import java.util.ArrayList;

/**
 * Created by theo on 06/03/2018.
 */

public class JobDepartment {

    public String department;
    public ArrayList<String> jobs;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobDepartment that = (JobDepartment) o;

        if (department != null ? !department.equals(that.department) : that.department != null)
            return false;
        return jobs != null ? jobs.equals(that.jobs) : that.jobs == null;
    }

    @Override
    public int hashCode() {
        int result = department != null ? department.hashCode() : 0;
        result = 31 * result + (jobs != null ? jobs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JobDepartment{" +
                "department='" + department + '\'' +
                ", jobs=" + jobs +
                '}';
    }
}
