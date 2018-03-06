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
    private String profile_path;

    public Crew(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String getProfile_path() {
        return profile_path;
    }

    public void setProfile_path(String profile_path) {
        this.profile_path = profile_path;
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

    @Override
    public String toString() {
        return "Crew{" +
                "id=" + id +
                ", creditId='" + creditId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", job='" + job + '\'' +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
