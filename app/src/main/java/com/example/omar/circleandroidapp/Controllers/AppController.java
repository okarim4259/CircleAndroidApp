package com.example.omar.circleandroidapp.Controllers;

import android.content.Context;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.omar.circleandroidapp.Utilities.NetworkConnection;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Omar on 9/3/2017.
 */

public class AppController {

    public void makeJsonObjectRequest(String path, Context context, JSONObject requestBody, int RequestType, final JsonObjectCallback callback){
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(RequestType, path, requestBody,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            callback.onSuccess(response);
                            Log.v("REGISTER", response.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        NetworkConnection.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjReq);
    }

    public void makeJsonArrayRequest(String token, String path, Context context, int RequestType, final JsonArrayCallback callback){
        final String authToken = token;
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(RequestType, path, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            callback.onSuccess(response);
                            Log.v("CURRENT", response.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                String key = "Authorization";
                String value = "Bearer "+ authToken.trim();
                Map<String, String>  params = new HashMap<String, String>();
                params.put(key, value);
                return params;
            }
        };
        NetworkConnection.getInstance(context.getApplicationContext()).addToRequestQueue(jsonArrayRequest);
    }

    public void makeRequestWithHeaders(String token, String path, Context context, JSONObject requestBody, int RequestType, final JsonObjectCallback callback){
        final String authToken = token;
        JsonObjectRequest jsonObjReq = new JsonObjectRequest(RequestType, path, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            callback.onSuccess(response);
                            Log.v("CURRENT", response.toString());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                String key = "Authorization";
                String value = "Bearer "+ authToken.trim();
                Map<String, String>  params = new HashMap<String, String>();
                params.put(key, value);
                return params;
            }
        };
        NetworkConnection.getInstance(context.getApplicationContext()).addToRequestQueue(jsonObjReq);
    }

}
