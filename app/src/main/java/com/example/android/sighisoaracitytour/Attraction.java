package com.example.android.sighisoaracitytour;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Stefan on 3/29/2018.
 */

public class Attraction implements Parcelable {
    private String name;
    private String website;
    private String description;
    private int imageID;
    private int circleImageID;
    //TO DO (to implement)
    private double rating;

    // constructor
    public Attraction(String name_attraction, String website_attraction,
                      String description_attraction, int imageID_attraction,
                      int circleImageID_attraction, double rating_attraction) {
        name = name_attraction;
        website = website_attraction;
        description = description_attraction;
        imageID = imageID_attraction;
        circleImageID = circleImageID_attraction;
        rating = rating_attraction;
    }

    protected Attraction(Parcel in) {
        name = in.readString();
        website = in.readString();
        description = in.readString();
        imageID = in.readInt();
        circleImageID = in.readInt();
        rating = in.readDouble();
    }

    public static final Creator<Attraction> CREATOR = new Creator<Attraction>() {
        @Override
        public Attraction createFromParcel(Parcel in) {
            return new Attraction(in);
        }

        @Override
        public Attraction[] newArray(int size) {
            return new Attraction[size];
        }
    };

    //get the name of the attraction
    public String getName() {
        return name;
    }

    // get the website of the attraction
    public String getWebsite() {
        return website;
    }

    //get the description of the attraction
    public String getDescription() {
        return description;
    }

    //get the big image of the attraction
    public int getImageID() {
        return imageID;
    }

    //get the small circle image of the attraction that represent the brand
    public int getCircleImageID() {
        return circleImageID;
    }

    //get rating for each attraction.
    public double getRating()

    {
        return rating;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(website);
        parcel.writeString(description);
        parcel.writeInt(imageID);
        parcel.writeInt(circleImageID);
        parcel.writeDouble(rating);
    }
}

