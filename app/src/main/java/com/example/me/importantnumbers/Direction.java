package com.example.me.importantnumbers;

/**
 * Created by m.elshaeir on 11/22/2017.
 */

public class Direction {
    public  double lat,lang;


    public Direction(double lat, double lang) {
        this.lat = lat;
        this.lang = lang;
    }

    public double getLat() {

        return lat;
    }

    public void setLat(double lat) {

        this.lat = lat;
    }

    public double getLang()
    {
        return lang;
    }

    public void setLang(double lang)
    {
        this.lang = lang;
    }
}
