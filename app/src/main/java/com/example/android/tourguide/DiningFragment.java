package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DiningFragment extends Fragment {

    public DiningFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.aiola_dining, R.string.aiolaUpstairs, R.string.aiolaText, R.string.aiolaAddress, R.string.aiolaWeb));
        places.add(new Place(R.drawable.speisesaal_dining, R.string.speisesaal, R.string.speisesaalText, R.string.speisesaalAddress, R.string.speisesaalWeb));
        places.add(new Place(R.drawable.magnolia_dining, R.string.magnolia, R.string.magnoliaText, R.string.magnoliaAddress, R.string.magnoliaWeb));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.listBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
