package com.example.android.sighisoaracitytour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends BaseNavigationDrawer {
    // # milliseconds, desired time passed between two back presses
    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup content = (ViewGroup) findViewById(R.id.flContent);
        getLayoutInflater().inflate(R.layout.activity_main, content, true);
        // for the menu option to be active
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        //start with a default fragment
        Fragment fragment = new RestaurantsFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.flContent, fragment)
                .commit();

    }


/*
Source:
https://stackoverflow.com/questions/8430805/clicking-the-back-button-twice-to-exit-an-activity?utm
_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
 */

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }

        mBackPressed = System.currentTimeMillis();
    }

}
