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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.hotel_1_name), getString(R.string.hotel_1_website)
                , getString(R.string.hotel_1_description), R.drawable.hilton_image, R.drawable.hilton_logo,
                4.3));
        attractions.add(new Attraction(getString(R.string.hotel_2_name), getString(R.string.hotel_2_website)
                , getString(R.string.hotel_2_description), R.drawable.casaseasca_image,
                R.drawable.casasaseasca_logo, 4));
        attractions.add(new Attraction(getString(R.string.hotel_3_name), getString(R.string.hotel_3_website)
                , getString(R.string.hotel_3_description), R.drawable.hotelkorona_image,
                R.drawable.hotelkorona_logo, 4.5));
        attractions.add(new Attraction(getString(R.string.hotel_4_name), getString(R.string.hotel_4_website)
                , getString(R.string.hotel_4_description), R.drawable.casawagner_image,
                R.drawable.casawagner_logo, 3.9));
        attractions.add(new Attraction(getString(R.string.hotel_5_name), getString(R.string.hotel_5_website)
                , getString(R.string.hotel_5_description), R.drawable.taschler_image,
                R.drawable.taschler_logo, 4.9));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AttractionAdapter attraction = new AttractionAdapter(getActivity(), attractions);
        recyclerView.setAdapter(attraction);
        return rootView;

    }

}
