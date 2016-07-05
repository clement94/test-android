package com.cberthelot.openclasstutorial.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class SettingsFragment extends PreferenceFragment {

    private static final String KEY_SETTINGS = "settings";
    private static final String HEADER_EDIT = "header_edit";
    private static final String HEADER_AGENDA = "header_agenda";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show right preference due to arguments in the fragment.
        final String settings = getArguments().getString(KEY_SETTINGS);
        if (HEADER_EDIT.equals(settings)) {
            addPreferencesFromResource(R.xml.settings_edit);
        } else if (HEADER_AGENDA.equals(settings)) {
            addPreferencesFromResource(R.xml.settings_agenda);
        }
    }
}
