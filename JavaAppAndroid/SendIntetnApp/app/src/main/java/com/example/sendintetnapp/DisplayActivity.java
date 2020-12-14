package com.example.sendintetnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );

        Intent intent = getIntent();
        String massage = intent.getStringExtra( MainActivity.EXTRA_MASSAGE );

        TextView textView = new TextView( this );
        textView.setTextSize( 20 );
        textView.setText( massage );

        setContentView( textView );

    }
}
