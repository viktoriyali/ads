package com.example.ads;

/**
 * Created by Виктория on 27.04.2017.
 */

class Apartment {


    private float latitude;
    private float longtitude;
    private int numberOfRooms;

    public Apartment() {
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLongtitude(float longtitude) {
        this.longtitude = longtitude;
    }

    public float getLongtitude() {
        return longtitude;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }
}
