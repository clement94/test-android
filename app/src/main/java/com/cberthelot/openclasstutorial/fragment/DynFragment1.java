package com.cberthelot.openclasstutorial.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class DynFragment1 extends Fragment {
    private static final String ARTICLE_ID = "ARTICLE_ID";

    private final static String TAG = "DynFragment1";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Create view for dynamic fragment with article id : " +  this.getArguments().getInt(ARTICLE_ID));
        return inflater.inflate(R.layout.dyn_frag1, container, false);
    }

    public static DynFragment1 newInstance(int articleId) {
        DynFragment1 fragment = new DynFragment1();
        Bundle args = new Bundle();
        args.putInt(ARTICLE_ID, articleId);
        fragment.setArguments(args);
        return fragment;
    }
}
