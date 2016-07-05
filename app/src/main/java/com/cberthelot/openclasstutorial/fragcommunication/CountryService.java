package com.cberthelot.openclasstutorial.fragcommunication;

import com.cberthelot.openclasstutorial.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class CountryService {

    static List<Country> countries = new ArrayList<>();
    static {
        countries.add(new Country(1, "France", R.drawable.france));
        countries.add(new Country(2, "Angleterre", R.drawable.england));
        countries.add(new Country(3, "Espagne", R.drawable.mario));
        countries.add(new Country(4, "Italie", R.drawable.carre));
        countries.add(new Country(5, "Allemagne", R.drawable.france));
        countries.add(new Country(6, "Suisse", R.drawable.england));
        countries.add(new Country(7, "Irlande", R.drawable.mario));
        countries.add(new Country(8, "Pays-Bas", R.drawable.carre));
        countries.add(new Country(9, "Suède", R.drawable.france));
        countries.add(new Country(10, "Norvège", R.drawable.england));
    }

    public static List<Country> getCountries() {
        return countries;
    }
}
