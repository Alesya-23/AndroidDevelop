package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SportActivity extends AppCompatActivity {
    public static String EXTRA_SPORT = "SportID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sport );

        int sportID = (Integer) getIntent().getExtras().get( EXTRA_SPORT );
        Sport sport = Sport.sports[sportID];

        ImageView imageView = findViewById( R.id.image );
        imageView.setImageResource( sport.getImageResourseID() );
        imageView.setContentDescription( sport.getName() );

        TextView textView = findViewById( R.id.name );
        textView.setText( sport.getName() );

        TextView textView1 = findViewById( R.id.description );
        textView1.setText( sport.getDescription() );
    }
}
