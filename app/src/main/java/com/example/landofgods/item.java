package com.example.landofgods;

public class item {
    private  String loaction;
    private String  Description;
    private int ImageResourceId;

    public item(String loaction, String description, int imageResourceId) {
        this.loaction = loaction;
        Description = description;
        ImageResourceId = imageResourceId;
    }

    public String getLoaction() {
        return loaction;
    }

    public String getDescription() {
        return Description;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }
}
