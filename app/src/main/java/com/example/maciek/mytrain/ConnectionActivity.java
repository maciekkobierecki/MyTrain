package com.example.maciek.mytrain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Maciek on 10.10.2017.
 * This class object provides showing available trains(if exists)
 * on specified connection.
 */

public class ConnectionActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);
    }
}
