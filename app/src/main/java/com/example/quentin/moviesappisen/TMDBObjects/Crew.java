package com.example.quentin.moviesappisen.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class Crew {
    private final int id;
    private String creditId;
    private String name;
    private String department;
    private String job;
    private String profilePath;

    public Crew(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getProfilePath() {
        return profilePath;
    }

    public void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Crew crew = (Crew) o;

        return id == crew.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
