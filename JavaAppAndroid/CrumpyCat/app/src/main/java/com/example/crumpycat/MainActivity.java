package com.example.crumpycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        initRecycleView();
    }

    private void initRecycleView() {
        RecyclerView recyclerView = findViewById( R.id.recycle_view );
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager( layoutManager );

        RecyclerView.Adapter adapter = new CrumpyCatAdapter( generateCats() );
        recyclerView.setAdapter( adapter );
    }

    private static List<CrumpyCat> generateCats() {
        List<CrumpyCat> crumpyCats = new ArrayList<>();
        crumpyCats.add( new CrumpyCat( "Василий", "https://images.wallpaperscraft.ru/image/kot_polosatyy_morda_trava_26075_1280x1024.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Семён", "https://funik.ru/wp-content/uploads/2018/10/17478da42271207e1d86.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Эдвард", "https://s1.1zoom.ru/b6755/973/Cats_Kittens_Grey_Glance_Wicker_basket_517968_1366x768.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Николай", "https://www.tomswallpapers.com/pic/201611/1366x768/tomswallpapers.com-78661.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Александр", "https://catandcat.su/wp-content/uploads/2019/10/original-1024x768.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Денис", "https://f.vividscreen.info/soft/0fb9211bf08217504f55c4cf28405fe0/Portrait-Of-Cat-1920x1408.jpg" ) );
        crumpyCats.add( new CrumpyCat( "Таня", "https://os1.i.ua/1/8/234456.jpg" ) );
        return crumpyCats;
    }
}
