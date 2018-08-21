package com.example.pals.keralatours;

import android.widget.ImageView;

import java.util.ArrayList;

public class LocationModel {

    private String location ;
    private String desc;
    private int mImageId;
//    private ArrayList<String> destinations;


    public LocationModel() {
    }

    public LocationModel(String location, String desc, int mImageId) {
        this.location = location;
        this.desc = desc;
        this.mImageId = mImageId;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }
}
