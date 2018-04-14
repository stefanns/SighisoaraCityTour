package com.example.android.sighisoaracitytour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsActivity extends BaseNavigationDrawer {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ViewGroup content = findViewById(R.id.flContent);
        getLayoutInflater().inflate(R.layout.activity_details, content, true);
        setResources();

    }

    public void setResources() {
        int position;
        ArrayList<Attraction> attractions;
        Intent intent = getIntent();
        //get data from list with intents
        position = intent.getIntExtra("position", 0);
        attractions = intent.getParcelableArrayListExtra("attractions");
        //initialize and set the main image
        ImageView bigImage = findViewById(R.id.image_attraction_detail);
        bigImage.setImageResource(attractions.get(position).getImageID());
        //initialize and set the logo image
        ImageView logoImage = findViewById(R.id.logo_attraction_detail);
        logoImage.setImageResource(attractions.get(position).getCircleImageID());
        //initialize and set text for the name of the attraction
        TextView name = findViewById(R.id.text_name_attraction_detail);
        name.setText(attractions.get(position).getName());
        //initialize and set for rating bar
        RatingBar ratingBar = findViewById(R.id.rating_bar_detail);
        //cast to float, rating bar can't take double
        float rating = (float) attractions.get(position).getRating();
        ratingBar.setRating(rating);
        //initialize and set website
        TextView website = findViewById(R.id.text_website_detail);
        website.setText(attractions.get(position).getWebsite());
        //initialize and set description
        TextView description = findViewById(R.id.text_description_detail);
        description.setText(attractions.get(position).getDescription());
        //initialize and set rating value
        TextView ratingText = findViewById(R.id.text_rating_detail);
        //convert to string to be possible to set to textView
        String ratingConverted = Double.toString(attractions.get(position).getRating());
        ratingText.setText(ratingConverted);
    }

    /*
        TO REDO - not working properly
      used to close the activity when a fragment
      from navigation drawer is opened
     */
    @Override
    public void selectDrawerItem(MenuItem menuItem) {
        this.finish();
        super.selectDrawerItem(menuItem);

    }

    /*
    for navigation between detail activity and previous
     activity.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

}

