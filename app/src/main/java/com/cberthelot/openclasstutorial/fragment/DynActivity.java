package com.cberthelot.openclasstutorial.fragment;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class DynActivity extends FragmentActivity {


    // We instantiate just one time fragments during the life of the activity.
    private final DynFragment1 mDynamic1Fragment = DynFragment1.newInstance(1);
    private final DynFragment1 mDynamic15Fragment = DynFragment1.newInstance(5);
    private final DynFragment2 mDynamic2Fragment = new DynFragment2();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dyn_activity);
            showFragment(mDynamic1Fragment);
    }

    private void showFragment(final Fragment fragment) {
        if (fragment == null) {
            return;
        }

        //Begin a fragment transaction
        final FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction ft = fm.beginTransaction();

        ft.setCustomAnimations(android.support.v7.appcompat.R.anim.abc_slide_in_bottom,
                android.support.v7.appcompat.R.anim.abc_slide_out_top);

        ft.replace(R.id.frameLayout, fragment);

        ft.addToBackStack(null);

        ft.commit();

    }

    public void goToFrag1(View v) {
        showFragment(this.mDynamic1Fragment);
    }

    public void goToFrag2(View v) {
        showFragment(this.mDynamic2Fragment);
    }


}
