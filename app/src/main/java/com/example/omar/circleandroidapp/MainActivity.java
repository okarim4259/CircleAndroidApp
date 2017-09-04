package com.example.omar.circleandroidapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.example.omar.circleandroidapp.Controllers.AppController;
import com.example.omar.circleandroidapp.Controllers.Routes;
import com.example.omar.circleandroidapp.Controllers.JsonObjectCallback;
import com.example.omar.circleandroidapp.Utilities.JsonObjectMaker;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    private EditText email;
    private EditText password;
    private Button registerBtn;
    private TextView textView;

    private String emailVal, passwordVal;
    private Context mainActivityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mainActivityContext = getApplicationContext();

//        email = (EditText)findViewById(R.id.email);
//        password = (EditText)findViewById(R.id.password);
//        registerBtn = (Button)findViewById(R.id.registerBtn);
//        textView = (TextView)findViewById(R.id.mainList1);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                emailVal = email.getText().toString();
//                passwordVal = password.getText().toString();
//                String[] keys = {"email", "password"};
//                String[] values = {emailVal, passwordVal};

            }
        });

    }
}
