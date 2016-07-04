package com.cberthelot.openclasstutorial.fragment;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class FragmentListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

}
