package com.cberthelot.openclasstutorial.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class ActivityWithFragment extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_fragment);
    }
}
