package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class BarsAndNightlifeFragment extends Fragment {
    public  BarsAndNightlifeFragment () {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.threemonkeys_bar,R.string.threeMonkeys,R.string.threeMonkeysText,R.string.threeMonkeysAddress,R.string.threeMonkeysWeb));
        places.add(new Place(R.drawable.cafebarorange_nightlife,R.string.cafeBarOrange,R.string.cafeBarOrangeText,R.string.cafeBarOrangeAddress,R.string.cafeBarOrangeWeb));
        places.add(new Place(R.drawable.ppc_nightlife,R.string.ppc,R.string.ppcText,R.string.ppcAddress,R.string.ppcWeb));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.listBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
