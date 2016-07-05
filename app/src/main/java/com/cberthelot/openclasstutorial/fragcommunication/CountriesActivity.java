package com.cberthelot.openclasstutorial.fragcommunication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class CountriesActivity extends Activity
        implements CountryListFragment.OnCountrySelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countries_activity);

        if (findViewById(R.id.frameLayoutDynamicUi) != null) {
            //On est en mode portrait
            final CountryListFragment listFragment = new CountryListFragment();
            getFragmentManager().beginTransaction()
                    .add(R.id.frameLayoutDynamicUi, listFragment)
                    .commit();
        }
    }

    @Override
    public void onCountrySelected(int countryCode) {
        if (findViewById(R.id.frameLayoutDynamicUi) == null) {
            //On est en mode paysage
            CountryDetailsFragment detailsFragment = (CountryDetailsFragment) getFragmentManager().findFragmentById(R.id.fragmentDetails);
            detailsFragment.updateCountry(countryCode);
        } else {
            //On est en mode portrait, il faut switcher le fragment affiché.
            CountryDetailsFragment detailsFragment = CountryDetailsFragment.newInstance(countryCode);
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.frameLayoutDynamicUi, detailsFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
