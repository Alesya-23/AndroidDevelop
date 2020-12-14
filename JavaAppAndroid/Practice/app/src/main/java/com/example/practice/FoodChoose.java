package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FoodChoose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_food_choose );

        setTitle( "Food Choose" );
    }
}
