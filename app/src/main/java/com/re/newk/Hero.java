package com.re.newk;

public class Hero {
    public String name;
    public String imageurl;

    public Hero(String name, String imageurl){
        this.name = name;
        this.imageurl = imageurl;

    }

    public String getImageurl() {
        return imageurl;
    }

    public String getName() {
        return name;
    }
}
