package com.example.omar.circleandroidapp.Utilities;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Omar on 9/3/2017.
 */

public class JsonObjectMaker {

    private JSONObject jsonObjectRequest;
    private String[] keys;
    private String[] values;

    public JsonObjectMaker(String[] keys, String[] values) {
        this.keys = keys;
        this.values = values;
    }

    public void setParams(){
        jsonObjectRequest = new JSONObject();
        if(keys.length == values.length){
            try{
                for(int i = 0; i < values.length; i++){
                    jsonObjectRequest.put(keys[i], values[i]);
                }
                Log.v("JSON", jsonObjectRequest.toString());
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
    }

    public JSONObject getRequestBody(){
        return this.jsonObjectRequest;
    }

}
