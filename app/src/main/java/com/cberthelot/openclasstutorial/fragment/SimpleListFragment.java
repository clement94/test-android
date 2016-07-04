package com.cberthelot.openclasstutorial.fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.cberthelot.openclasstutorial.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class SimpleListFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View listView = inflater.inflate(R.layout.fragment_listview, container);
        return listView;
    }

    private static List<User> users = new ArrayList<User>();
    private Header header = new Header(R.drawable.mario, "super titre de fou");
    static {
        users.add(new User("clement", 34));
        users.add(new User("maelle", 32));
        users.add(new User("juliette", 2));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.row_layout, R.id.fragTextView,
//                getResources().getStringArray(R.array.planets));

//        final CustomListViewAdapter adapter = new CustomListViewAdapter(getActivity());
//        adapter.bind(users);

        final DynamicListViewAdapter adapter = new DynamicListViewAdapter(getActivity());
        adapter.bindHeader(header);
        adapter.bindData(users);
        setListAdapter(adapter);

    }



}
