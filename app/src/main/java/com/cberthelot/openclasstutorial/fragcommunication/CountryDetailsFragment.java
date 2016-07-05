package com.cberthelot.openclasstutorial.fragcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class CountryDetailsFragment extends Fragment {

    private static final String COUNTRY_CODE = "com.cberthelot.openclasstutorial.fragcommunication.COUNTRY_CODE";

    ImageView flagImageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.flag_layout, container, false);
        flagImageView = (ImageView) view.findViewById(R.id.flagImageView);

        if ( this.getArguments() != null) {
            int countryCode = this.getArguments().getInt(COUNTRY_CODE);
            updateCountry(countryCode);
        } else {
            flagImageView.setImageResource(R.drawable.default_flag);
        }

        return view;
    }

    public static CountryDetailsFragment newInstance(int countryCode) {
        CountryDetailsFragment fragment = new CountryDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(COUNTRY_CODE, countryCode);
        fragment.setArguments(bundle);
        return fragment;
    }

    /**
     * Affiche le drapeau du pays sélectionné
     * @param countryCode
     */
    public void updateCountry(int countryCode) {
        Country country = null;
        for (Country c : CountryService.getCountries()) {
            if (c.code == countryCode) {
                country = c;
                break;
            }
        }
        flagImageView.setImageResource(country.flagResourceId);
    }
}
