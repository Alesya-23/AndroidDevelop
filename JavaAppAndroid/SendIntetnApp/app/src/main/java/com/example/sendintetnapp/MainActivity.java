package com.example.sendintetnapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MASSAGE = "hello!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void sendMessage(View view) {
        Intent intent = new Intent( this, DisplayActivity.class );
        EditText editText = findViewById( R.id.send_text );
        String massage = editText.getText().toString();
        intent.putExtra( EXTRA_MASSAGE, massage );
        startActivity( intent );

    }
}
