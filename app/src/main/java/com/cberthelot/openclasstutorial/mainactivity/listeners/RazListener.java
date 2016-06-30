package com.cberthelot.openclasstutorial.mainactivity.listeners;

import android.view.View;

import com.cberthelot.openclasstutorial.mainactivity.views.Views;

/**
 * Created by cberthelot on 14/06/2016.
 */
public class RazListener implements View.OnClickListener {

    private final static String TAG = "RazListener";

    @Override
    public void onClick(View v) {
        Views.poids.setText("0");
        Views.taille.setText("0");
    }
}
