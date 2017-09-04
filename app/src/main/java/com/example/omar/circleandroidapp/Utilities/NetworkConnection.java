package com.example.omar.circleandroidapp.Utilities;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Omar on 9/3/2017.
 */

public class NetworkConnection {

    private static NetworkConnection mInstance;
    private RequestQueue requestQueue;
    private static Context mCtx;

    private NetworkConnection(Context context){
        this.mCtx = context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized NetworkConnection getInstance(Context context){
        if(mInstance == null){
            mInstance = new NetworkConnection(context);
        }
        return mInstance;
    }

    public<T> void addToRequestQueue(Request<T> request){
        requestQueue.add(request);
    }

}
