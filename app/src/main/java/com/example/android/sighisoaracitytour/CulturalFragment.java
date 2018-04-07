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
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
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
        attractions.add(new Attraction(getString(R.string.cultural_2_name), getString(R.string.cultural_2_website)
                , getString(R.string.cultural_2_description), R.drawable.coveredstairway_image, R.drawable.coveredstairs_logo,
                4.5));
        attractions.add(new Attraction(getString(R.string.cultural_3_name), getString(R.string.cultural_3_website)
                , getString(R.string.cultural_3_description), R.drawable.churchhill_image, R.drawable.churchhill_logo,
                4.7));
        attractions.add(new Attraction(getString(R.string.cultural_4_name), getString(R.string.cultural_4_website)
                , getString(R.string.cultural_4_description), R.drawable.sighisoaraceter_image, R.drawable.sighisoaracenter_logo,
                4.7));
        attractions.add(new Attraction(getString(R.string.cultural_5_name), getString(R.string.cultural_5_website)
                , getString(R.string.cultural_5_description), R.drawable.sighisoarafestival_image
                , R.drawable.sighisoarafestival_logo,
                4.7));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        AttractionAdapter attraction = new AttractionAdapter(getActivity(), attractions);
        recyclerView.setAdapter(attraction);
        return rootView;
    }

}
