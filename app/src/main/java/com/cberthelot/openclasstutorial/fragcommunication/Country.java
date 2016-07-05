package com.cberthelot.openclasstutorial.fragcommunication;

/**
 * Created by cberthelot on 05/07/2016.
 */
public class Country {

    int code;
    String name;
    int flagResourceId;

    public Country(int code, String name, int flagResourceId) {
        this.code = code;
        this.name = name;
        this.flagResourceId = flagResourceId;
    }

    @Override
    public String toString() {
        return name;
    }
}
