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
public class DynamicListViewAdapter extends BaseAdapter {

    private List<User> users;
    private Header header;

    private Context mContext;

    public DynamicListViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_DATA = 1;
    private List<Integer> mTypes = new ArrayList<Integer>();

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return mTypes.get(position);
    }

    public void bindHeader(Header header) {
        this.header = header;
        mTypes.add(TYPE_HEADER);
    }

    public void bindData(List<User> users) {
        this.users = users;
        for (int i = 0; i < this.users.size(); i++) {
            mTypes.add(TYPE_DATA);
        }
    }

    @Override
    public int getCount() {
        if (this.header == null) {
            return users.size();
        }
        return 1 + users.size();
    }

    @Override
    public Object getItem(int position) {
        int type = getItemViewType(position);
        return type == TYPE_HEADER ? this.header : this.users.get(position - 1);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = null;
        int type = getItemViewType(position);

        if (convertView == null) {
            switch (type) {
                case TYPE_HEADER:
                    v = new HeaderListViewView(mContext);
                    break;
                case TYPE_DATA:
                    v = new CustomListViewView(mContext);
                    break;
            }
        } else {
            switch (type) {
                case TYPE_HEADER:
                    v = (HeaderListViewView) convertView;
                    break;
                case TYPE_DATA:
                    v = (CustomListViewView) convertView;
                    break;
            }
        }

        switch (type) {
            case TYPE_HEADER:
                Header model1 = (Header) getItem(position);
                ((HeaderListViewView) v).bind(model1);
                break;
            case TYPE_DATA:
                User model2 = (User) getItem(position);
                ((CustomListViewView) v).bind(model2);
                break;
        }

        return v;
    }
}
