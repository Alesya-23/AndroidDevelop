package com.example.recycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "LifeCycle";
    private TextView mInfoLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        mInfoLog = findViewById( R.id.textView );
        Toast.makeText( getApplicationContext(), "onCreate", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onCreate" );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText( getApplicationContext(), "onStart", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText( getApplicationContext(), "onResume", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText( getApplicationContext(), "onPause", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText( getApplicationContext(), "onStop", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onStop" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText( getApplicationContext(), "onRestart", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onRestart" );
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText( getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT ).show();
        Log.i( TAG, "onDestroy" );
    }

    public void clickButton(View view) {
        switch (view.getId()) {
            case R.id.buttonClick:
                mInfoLog.setText( "Приложение уже было запущено" );
                break;
            case R.id.exitApp:
                finish();
                break;
            default:
                break;
        }
    }
}
