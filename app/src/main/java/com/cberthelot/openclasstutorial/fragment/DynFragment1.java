package com.cberthelot.openclasstutorial.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class DynFragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dyn_frag1, container, false);
    }
}
