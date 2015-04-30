package edu.uw.tacoma.mmuppa.locationexample;

import android.location.Location;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mmuppa on 4/29/15.
 */
public class LocationLog implements Serializable {


    private List<Double> mLatitudes;
    private List<Double> mLongitudes;

    public LocationLog() {
        mLatitudes = new ArrayList<Double>();
        mLongitudes = new ArrayList<Double>();
    }

    public void addLocation(Location location) {
        mLatitudes.add(location.getLatitude());
        mLongitudes.add(location.getLongitude());
    }

    public List<Double> getLatitudes() {
        return mLatitudes;
    }

    public List<Double> getLongitudes() {
        return mLongitudes;
    }
}
