package com.cberthelot.openclasstutorial.fragment;

/**
 * Created by cberthelot on 04/07/2016.
 */
public class Header {
    private int imageResourceId;
    private String title;

    public Header(String title) {
        this.title = title;
    }

    public Header(int imageResourceId, String title) {
        this.imageResourceId = imageResourceId;
        this.title = title;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
