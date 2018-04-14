package com.example.android.sighisoaracitytour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopPicksFragment extends Fragment {


    public TopPicksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.cultural_1_name), getString(R.string.cultural_2_website)
                , getString(R.string.cultural_2_description), R.drawable.clocktower_image, R.drawable.clocktower_logo,
                4.7));
        attractions.add(new Attraction(getString(R.string.restaurant_1_name), getString(R.string.restaurant_1_website)
                , getString(R.string.restaurant_1_description), R.drawable.joseph_image, R.drawable.joseph_logo,
                4.9));
        attractions.add(new Attraction(getString(R.string.nightlife_3_name), getString(R.string.nightlife_3_website)
                , getString(R.string.nightlife_3_description), R.drawable.vintage_image, R.drawable.vintage_logo,
                4.6));
        attractions.add(new Attraction(getString(R.string.hotel_1_name), getString(R.string.hotel_1_website)
                , getString(R.string.hotel_1_description), R.drawable.hilton_image, R.drawable.hilton_logo,
                4.3));
        attractions.add(new Attraction(getString(R.string.cultural_2_name), getString(R.string.cultural_2_website)
                , getString(R.string.cultural_2_description), R.drawable.coveredstairway_image, R.drawable.coveredstairs_logo,
                4.5));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AttractionAdapter attraction = new AttractionAdapter(getActivity(), attractions);
        recyclerView.setAdapter(attraction);
        return rootView;
    }

}
