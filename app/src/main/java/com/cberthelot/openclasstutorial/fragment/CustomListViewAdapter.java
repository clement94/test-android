package com.cberthelot.openclasstutorial.fragment;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class CustomListViewAdapter extends BaseAdapter {

    private static List<User> users;

    private Context mContext;

    public CustomListViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public User getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomListViewView v = null;
        if (convertView == null) {
            v = new CustomListViewView(mContext);
        } else {
            v = (CustomListViewView) convertView;
        }
        v.bind(getItem(position));
        return v;
    }

    public void bind(List<User> model) {
        users = model;
    }
}
