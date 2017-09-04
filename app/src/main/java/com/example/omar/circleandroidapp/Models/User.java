package com.example.omar.circleandroidapp.Models;

/**
 * Created by Omar on 9/3/2017.
 */

public class User {

    private String _id;
    private String token;
    private String email;
    private String firstName;
    private String lastName;
    private Mission[] postedMissions;
    private Mission[] acceptedMissions;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Mission[] getPostedMissions() {
        return postedMissions;
    }

    public void setPostedMissions(Mission[] postedMissions) {
        this.postedMissions = postedMissions;
    }

    public Mission[] getAcceptedMissions() {
        return acceptedMissions;
    }

    public void setAcceptedMissions(Mission[] acceptedMissions) {
        this.acceptedMissions = acceptedMissions;
    }
}
