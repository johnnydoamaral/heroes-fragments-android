package com.johnny.heroesfragments.model;

public class Hero {

    private String name;
    private String realFirstName;
    private String realLastName;
    private int image;

    public Hero(String name, String realFirstName, String realLastName, int image) {
        this.name = name;
        this.realFirstName = realFirstName;
        this.realLastName = realLastName;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealFirstName() {
        return realFirstName;
    }

    public void setRealFirstName(String realFirstName) {
        this.realFirstName = realFirstName;
    }

    public String getRealLastName() {
        return realLastName;
    }

    public void setRealLastName(String realLastName) {
        this.realLastName = realLastName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
