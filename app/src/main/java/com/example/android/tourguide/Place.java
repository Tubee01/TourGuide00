package com.example.android.tourguide;

/**
 * Created by tamas on 2017. 06. 15..
 */

public class Place {

    private static final int NO_IMAGE_PROVIDED = -1;


    private int imageResourceId;
    private int mName;
    private int mInfo;
    private int mAddress;
    private int mWebsite;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //* Constructors for every possible combination \\

    public Place(int imageResourceId, int name, int info, int address, int website) {

        mName = name;
        mInfo = info;
        mAddress = address;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }


    public  int getInfo() {
        return  mInfo;
    }
    public  int getName(){
        return  mName;
    }
    public  int getmAddress() { return mAddress;}
    public  int getmWebsite() { return  mWebsite;}
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getImageResourceId() { return mImageResourceId; }
}


