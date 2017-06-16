package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DoAndSeeFragment extends Fragment {
    public DoAndSeeFragment(){
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.murinsel_place,R.string.murinsel,R.string.murinselText,R.string.murinselAddress,R.string.murinselWeb));
        places.add(new Place(R.drawable.kunsthaus_place,R.string.kunsthaus,R.string.kunsthausText,R.string.kunsthausAddress,R.string.kunsthausWeb));
        places.add(new Place(R.drawable.eggenber_palace,R.string.eggenbergPalace,R.string.eggenbergPalaceText,R.string.eggenbergPalaceAddress,R.string.eggenbergWeb));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.listBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


    return rootView;
    }
}



