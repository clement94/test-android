package com.cberthelot.openclasstutorial.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class MyDialogFragment extends DialogFragment {

    public static MyDialogFragment newInstance(int titleId) {

        Bundle args = new Bundle();
        args.putInt("title", titleId);

        MyDialogFragment fragment = new MyDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View dialogView = inflater.inflate(R.layout.fragment_dialog, container, false);
        Button button = (Button) dialogView.findViewById(R.id.closeDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().cancel();
            }
        });

        if (getArguments() != null) {
            getDialog().setTitle(getResources().getString(getArguments().getInt("title")));
        }

        return dialogView;
    }

}
