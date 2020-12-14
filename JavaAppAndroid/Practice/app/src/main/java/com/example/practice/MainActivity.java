package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        setTitle( "Practice" );

        buttonOneLayout();
        buttonTwoEatChoose();
        buttonThreeAnimal();
    }

    private void buttonOneLayout() {
        Button buttonLayout = findViewById( R.id.button_layout );
        buttonLayout.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayout = new Intent( MainActivity.this, LinearLayout.class );
                startActivity( intentLayout );
            }
        } );

    }

    private void buttonTwoEatChoose() {
        Button buttonEat = findViewById( R.id.button_eat );
        buttonEat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEat = new Intent( MainActivity.this, FoodChoose.class );
                startActivity( intentEat );
            }
        } );

    }

    private void buttonThreeAnimal() {
        Button buttonAnimal = findViewById( R.id.button_animal );
        buttonAnimal.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAnimal = new Intent( MainActivity.this, AnimalActivity.class );
                startActivity( intentAnimal );
            }
        } );

    }
}
