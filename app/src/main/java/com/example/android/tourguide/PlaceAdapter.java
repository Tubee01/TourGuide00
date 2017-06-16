package com.example.android.tourguide;

/**
 * Created by tamas on 2017. 06. 16..
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Place} objects.
 */

public class PlaceAdapter extends  ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
                    }
        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            //Get the {@link Place} object located at this position in the list
            Place currentPlace = getItem(position);

            //Find the TextView in the list layout with the ID name_text_view
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
            nameTextView.setText(currentPlace.getName());

            //Find the TextView in the list layout with the ID default_text_view
            TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
            defaultTextView.setText(currentPlace.getInfo());

            //Find the ImageView in the list layout with the id image
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
            if (currentPlace.hasImage()){
                imageView.setImageResource(currentPlace.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            }else {
                imageView.setVisibility(View.GONE);
            }
            //Find the TextView in the list layout with the ID websiteAddress_text_view
            TextView webView = (TextView) listItemView.findViewById(R.id.websiteAddress_text_view);
            webView.setText(currentPlace.getmWebsite());
            //Find the TextView in the list layout with the id address
            TextView addressView = (TextView) listItemView.findViewById(R.id.address_a_text_view);
            addressView.setText(currentPlace.getmAddress());

            // Set the theme color for the list item
            View textContainer = listItemView.findViewById(R.id.text_container);
            // Find the color that the resource ID maps to
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            // Set the background color of the text container View
            textContainer.setBackgroundColor(color);

            // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
            // the ListView.
            return listItemView;

        }
    }
