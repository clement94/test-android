package com.cberthelot.openclasstutorial.fragcommunication;



import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.cberthelot.openclasstutorial.R;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class CountryListFragment extends ListFragment {

    public interface OnCountrySelectedListener {
        void onCountrySelected(int countryCode);
    }

    private OnCountrySelectedListener onCountrySelectedListener;

    /**
     * Méthode pour afficher un texte lorsque la liste de fragment est vide.
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listview, container, false);
    }

    /**
     * Suite à la création de l'activité, il faut récupérer les données et les adapter à la vue que l'on souhaite utiliser.
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //On utilise un layout de base d'android pour afficher le toString() d'une country
        final ArrayAdapter<Country> adapter = new ArrayAdapter<Country>(getActivity(),
                android.R.layout.simple_list_item_1, CountryService.getCountries());
        setListAdapter(adapter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            onCountrySelectedListener = (OnCountrySelectedListener) context;
        } catch(ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnCountrySelectedListener");
        }

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (onCountrySelectedListener != null) {
            onCountrySelectedListener.onCountrySelected(CountryService.getCountries().get(position).code);
        }
    }
}
