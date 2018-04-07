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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.nightlife_1_name), getString(R.string.nightlife_1_website)
                , getString(R.string.nightlife_1_description), R.drawable.aristrocrat_image, R.drawable.aristrocat_logo,
                4.1));
        attractions.add(new Attraction(getString(R.string.nightlife_2_name), getString(R.string.nightlife_2_website)
                , getString(R.string.nightlife_2_description), R.drawable.voynich_image, R.drawable.voynich_logo,
                4.6));
        attractions.add(new Attraction(getString(R.string.nightlife_3_name), getString(R.string.nightlife_3_website)
                , getString(R.string.nightlife_3_description), R.drawable.vintage_image, R.drawable.vintage_logo,
                4.6));


        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AttractionAdapter attraction = new AttractionAdapter(getActivity(), attractions);
        recyclerView.setAdapter(attraction);
        return rootView;
    }

}
