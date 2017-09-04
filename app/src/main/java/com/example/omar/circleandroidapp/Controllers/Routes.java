package com.example.omar.circleandroidapp.Controllers;

import com.example.omar.circleandroidapp.Utilities.Config;

/**
 * Created by Omar on 9/3/2017.
 */

public class Routes {

    static final String baseUrl = Config.baseApiUrl;
    public String users_register = baseUrl + "/users/register";
    public String users_auth = baseUrl + "/users/authenticate";

    public String findByEmail(String email){
        return baseUrl + "/users/find/" + email;
    }

    public String findById(String _id){
        return baseUrl + "/users/" + _id;
    }

    public String getCurrentUser(){
        return baseUrl + "/users/current";
    }

    public String updateUserInfo(String _id){
        return baseUrl + "/users/" + _id;
    }

    public String deleteUserInfo(String _id){
        return baseUrl + "/users/" + _id;
    }

}
