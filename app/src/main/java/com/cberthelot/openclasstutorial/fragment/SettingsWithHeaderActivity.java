package com.cberthelot.openclasstutorial.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.cberthelot.openclasstutorial.R;

import java.util.List;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class SettingsWithHeaderActivity extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.headers, target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
}
