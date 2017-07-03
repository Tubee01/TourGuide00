package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AccommodationsFragment extends Fragment {

    public AccommodationsFragment() {
        // Required empty public constructor

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.palais_hotel, R.string.palaisHotel, R.string.palaisText, R.string.palaisHotelAddress, R.string.palaisHotelWeb));
        places.add(new Place(R.drawable.paradies_hotel, R.string.hotelParadies, R.string.hotelParadiesText, R.string.hotelParadiesAddress, R.string.hotelParadiesWeb));
        places.add(new Place(R.drawable.wiesler_hotel, R.string.hotelWiesler, R.string.hotelWieslerText, R.string.hotelWieslerAddress, R.string.hotelWieslerWebb));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.listBackground);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

