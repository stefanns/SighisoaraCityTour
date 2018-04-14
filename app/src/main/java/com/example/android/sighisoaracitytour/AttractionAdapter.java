package com.example.android.sighisoaracitytour;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Stefan on 3/29/2018.
 */

public class AttractionAdapter extends RecyclerView.Adapter<AttractionAdapter.AttractionViewHolder> {
    public ArrayList<Attraction> attractions;
    public Context context;

    public AttractionAdapter(Activity context, ArrayList<Attraction> AttractionAdapter) {
        this.context = context;
        this.attractions = AttractionAdapter;
    }


    @Override
    public AttractionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        AttractionViewHolder vh = new AttractionViewHolder(v);
        return vh;
    }


    //to implement this method with text views and images
    @Override
    public void onBindViewHolder(AttractionViewHolder holder, final int position) {
        String rating; // for String value of the Rating declared as double
        // set the data in items
        holder.name.setText(attractions.get(position).getName());
        // holder.description.setText(attractions.get(position).getDescription());
        Bitmap bigImage = BitmapFactory.decodeResource(context.getResources(), attractions.get(position).getImageID());
        holder.bigImage.setImageBitmap(bigImage);
        Bitmap circleImage = BitmapFactory.decodeResource(context.getResources(), attractions.get(position).getCircleImageID());
        holder.logo_image.setImageBitmap(circleImage);
        holder.ratingBar.setRating((float) attractions.get(position).getRating());
        //convert the double to String in order to display it in text view
        rating = Double.toString(attractions.get(position).getRating());
        holder.ratingNumber.setText(rating);

        /*set listener to each card view in list
        to open detail activity whenever the user click
        */
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // send data to detail activity
                Intent intent = new Intent(context, DetailsActivity.class);
                //send the ArrayList
                intent.putParcelableArrayListExtra("attractions", attractions);
                //send the position to correctly display views
                intent.putExtra("position", position);
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return attractions.size();
    }

    public class AttractionViewHolder extends RecyclerView.ViewHolder {
        //init item view
        TextView name;
        TextView ratingNumber;
        ImageView bigImage;
        ImageView logo_image;
        RatingBar ratingBar;
        View cardView;


        public AttractionViewHolder(View itemView) {
            super(itemView);

            //get views
            name = itemView.findViewById(R.id.text_name_attraction);
            // description = itemView.findViewById(R.id.text_description);
            bigImage = itemView.findViewById(R.id.image_attraction);
            //add circle image for brand
            logo_image = itemView.findViewById(R.id.logo_attraction);
            //add rating for each attraction
            ratingBar = itemView.findViewById(R.id.rating_bar);
            cardView = itemView.findViewById(R.id.list_card_view);
            //add text to display the rating in numeric value
            ratingNumber = itemView.findViewById(R.id.text_rating);
        }
    }
}

