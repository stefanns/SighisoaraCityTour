package com.example.android.sighisoaracitytour;

import android.os.Bundle;
import android.view.ViewGroup;

public class DetailsActivity extends BaseNavigationDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup content = (ViewGroup) findViewById(R.id.flContent);
        getLayoutInflater().inflate(R.layout.activity_details, content, true);
        //maybe works for the two action bars
    }
}
