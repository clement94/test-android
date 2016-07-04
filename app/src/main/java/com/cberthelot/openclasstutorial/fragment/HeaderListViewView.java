package com.cberthelot.openclasstutorial.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class HeaderListViewView extends LinearLayout {

    private TextView titleView;
    private ImageView imageView;

    public HeaderListViewView(Context context) {
        super(context);
        init();
    }

    public HeaderListViewView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HeaderListViewView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.header_layout, this);
        titleView = (TextView) findViewById(R.id.titleTextView);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void bind(Header header) {
        titleView.setText(header.getTitle());
        imageView.setImageResource(header.getImageResourceId());

    }

//    public void bind(int text) {
//        mTextView.setText(getResources().getString(text));
//    }
}
