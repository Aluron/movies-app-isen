package com.example.quentin.moviesappisen.TMDBObjects;

/**
 * Created by theo on 01/03/2018.
 */

public class GuestStar {
    private final int id;
    private String name;
    private String credit_id;
    private String character;
    private int order;
    private String profile_path;

    public GuestStar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredit_id() {
        return credit_id;
    }

    public void setCredit_id(String credit_id) {
        this.credit_id = credit_id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
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

        GuestStar guestStar = (GuestStar) o;

        return id == guestStar.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "GuestStar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credit_id='" + credit_id + '\'' +
                ", character='" + character + '\'' +
                ", order=" + order +
                ", profile_path='" + profile_path + '\'' +
                '}';
    }
}
