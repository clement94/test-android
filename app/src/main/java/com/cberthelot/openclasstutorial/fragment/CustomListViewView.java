package com.cberthelot.openclasstutorial.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class CustomListViewView extends LinearLayout {

    private TextView nameTextView;
    private TextView ageTextView;

    public CustomListViewView(Context context) {
        super(context);
        init();
    }

    public CustomListViewView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomListViewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.row_layout, this);
        nameTextView = (TextView) findViewById(R.id.nameTextView);
        ageTextView = (TextView) findViewById(R.id.ageTextView);
    }

    public void bind(User user) {
        nameTextView.setText(user.getName());
        ageTextView.setText(String.valueOf(user.getAge()));
    }

//    public void bind(int text) {
//        mTextView.setText(getResources().getString(text));
//    }
}
