package com.example.tvserias;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getListTV(String spinner) {
        List<String> list = new ArrayList<>();
        if (spinner.equals( "Комедия" ))
            list.add( "Друзья" );
        if (spinner.equals( "Фентези" ))
            list.add( "Ведьмак" );
        if (spinner.equals( "Ужасы" )) {
            list.add( "Дневники вампира" );
        }
        if (spinner.equals( "Фантастика" )) {
            list.add( "Проект синяя книга" );
        }
        if (spinner.equals( "Детектив" )) {
            list.add( "Настоящий детектив" );
        }
        return list;
    }
}
