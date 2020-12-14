package com.example.callintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        buttonMail();
        buttonWeb();
        buttonMap();
        buttonCall();
    }

    private void buttonMail() {
        Button buttonMail = findViewById( R.id.button_email );
        buttonMail.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEmail = new Intent( Intent.ACTION_VIEW, Uri.fromParts( "mailto",
                        "example@gmail.ru", null ) );
                intentEmail.putExtra( Intent.EXTRA_EMAIL, new String[]{"hello@mail.ru", "hi@,ail.com"} );
                intentEmail.putExtra( Intent.EXTRA_SUBJECT, "Send intent massage" );
                intentEmail.putExtra( Intent.EXTRA_TEXT, "I text my mail by android app" );

                if (isIntentSafe( intentEmail )) {
                    startActivity( intentEmail );
                } else
                    Toast.makeText( getApplicationContext(), "You phone don't have this app"
                            , Toast.LENGTH_SHORT ).show();

            }
        } );
    }

    private void buttonWeb() {
        Button buttonWeb = findViewById( R.id.button_page );
        buttonWeb.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webPage = Uri.parse( "http://vk.com" );
                Intent intentWeb = new Intent( Intent.ACTION_VIEW, webPage );

                if (isIntentSafe( intentWeb )) {
                    startActivity( intentWeb );
                } else
                    Toast.makeText( getApplicationContext(), "You phone don't have this app"
                            , Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void buttonMap() {
        Button buttonMap = findViewById( R.id.button_card );
        buttonMap.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri location = Uri.parse( "geo:37.422219,  -122.45543?z=14" );
                Intent intentMap = new Intent( Intent.ACTION_VIEW, location );

                if (isIntentSafe( intentMap )) {
                    startActivity( intentMap );
                } else
                    Toast.makeText( getApplicationContext(), "You phone don't have this app"
                            , Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private void buttonCall() {
        Button buttonCall = findViewById( R.id.button_call );
        buttonCall.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse( "tel:" );
                Intent intentCall = new Intent( Intent.ACTION_DIAL, number );

                if (isIntentSafe( intentCall )) {
                    startActivity( intentCall );
                } else
                    Toast.makeText( getApplicationContext(), "You phone don't have this app"
                            , Toast.LENGTH_SHORT ).show();
            }
        } );
    }

    private boolean isIntentSafe(Intent intent) {
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities( intent, 0 );
        return activities.size() > 0;
    }
}
