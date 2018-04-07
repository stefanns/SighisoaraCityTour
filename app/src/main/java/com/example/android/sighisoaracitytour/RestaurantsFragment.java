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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.restaurant_1_name), getString(R.string.restaurant_1_website)
                , getString(R.string.restaurant_1_description), R.drawable.joseph_image, R.drawable.joseph_logo,
                4.9));
        attractions.add(new Attraction(getString(R.string.restaurant_2_name), getString(R.string.restaurant_2_website)
                , getString(R.string.restaurant_2_description), R.drawable.gkrauss_image, R.drawable.gkrauss_logo,
                4.4));
        attractions.add(new Attraction(getString(R.string.restaurant_3_name), getString(R.string.restaurant_3_website)
                , getString(R.string.restaurant_3_description), R.drawable.gasthaus_image, R.drawable.gasthaus_logo,
                4.3));
        attractions.add(new Attraction(getString(R.string.restaurant_4_name), getString(R.string.restaurant_4_website)
                , getString(R.string.restaurant_4_description), R.drawable.cositorarului_image, R.drawable.cositorarului_logo,
                4.2));
        attractions.add(new Attraction(getString(R.string.restaurant_5_name), getString(R.string.restaurant_5_website)
                , getString(R.string.restaurant_5_description), R.drawable.casaferdinand_image, R.drawable.casaferdinand_logo,
                4.2));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AttractionAdapter attraction = new AttractionAdapter(getActivity(), attractions);
        recyclerView.setAdapter(attraction);
        return rootView;
    }

}
