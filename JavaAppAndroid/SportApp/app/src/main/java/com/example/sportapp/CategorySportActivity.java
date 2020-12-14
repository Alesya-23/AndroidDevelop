package com.example.sportapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategorySportActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        ListView listSport = getListView();
        ArrayAdapter<Sport> listAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, Sport.sports );
        listSport.setAdapter( listAdapter );
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent( CategorySportActivity.this, SportActivity.class );
        intent.putExtra( SportActivity.EXTRA_SPORT, (int) id );
        startActivity( intent );
    }
}
