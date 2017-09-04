package com.example.omar.circleandroidapp.Models;

/**
 * Created by Omar on 9/3/2017.
 */

public class Mission {

    private String _id;
    private String posterID;
    private String posterEmail;
    private String title;
    private String location;
    private User[] candidates;
    private User[] accepted;
    private int minPeopleReq;
    private int maxPeopleReq;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getPosterID() {
        return posterID;
    }

    public void setPosterID(String posterID) {
        this.posterID = posterID;
    }

    public String getPosterEmail() {
        return posterEmail;
    }

    public void setPosterEmail(String posterEmail) {
        this.posterEmail = posterEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User[] getCandidates() {
        return candidates;
    }

    public void setCandidates(User[] candidates) {
        this.candidates = candidates;
    }

    public User[] getAccepted() {
        return accepted;
    }

    public void setAccepted(User[] accepted) {
        this.accepted = accepted;
    }

    public int getMinPeopleReq() {
        return minPeopleReq;
    }

    public void setMinPeopleReq(int minPeopleReq) {
        this.minPeopleReq = minPeopleReq;
    }

    public int getMaxPeopleReq() {
        return maxPeopleReq;
    }

    public void setMaxPeopleReq(int maxPeopleReq) {
        this.maxPeopleReq = maxPeopleReq;
    }
}
