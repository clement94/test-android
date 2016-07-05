package com.cberthelot.openclasstutorial.fragcommunication;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;

import com.cberthelot.openclasstutorial.R;
import com.cberthelot.openclasstutorial.fragment.SettingsWithHeaderActivity;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class CountriesActivity extends Activity
        implements CountryListFragment.OnCountrySelectedListener {

    public void openPreferences(View view) {
        Intent intent = new Intent(this, SettingsWithHeaderActivity.class);
        startActivity(intent);
    }

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

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean pref_key_pref_1 = prefs.getBoolean("pref_key_pref_1", false);
        boolean pref_key_pref_3 = prefs.getBoolean("pref_key_pref_3", false);
        Log.i("ACT", "pref_key_pref_1 : " + pref_key_pref_1);
        Log.i("ACT", "pref_key_pref_3 : " + pref_key_pref_3);
    }
}
