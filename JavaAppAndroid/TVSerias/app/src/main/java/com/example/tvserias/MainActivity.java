package com.example.tvserias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SeriesList seriesList = new SeriesList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void onClickChoose(View view) {
        TextView textView = findViewById( R.id.series_text );
        Spinner spinner = findViewById( R.id.general_list );
        String getList = String.valueOf( spinner.getSelectedItem() );
        List<String> listTv = seriesList.getListTV( getList );
        StringBuilder ListModified = new StringBuilder();
        for (String lists : listTv) {
            ListModified.append( lists );
        }
        textView.setText( ListModified );

    }
}
