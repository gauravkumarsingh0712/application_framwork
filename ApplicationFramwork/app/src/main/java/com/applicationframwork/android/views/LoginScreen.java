package com.applicationframwork.android.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.applicationframwork.android.R;

/**
 * Created by gauravkumar.singh on 7/19/2016.
 */
public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
    }
}
