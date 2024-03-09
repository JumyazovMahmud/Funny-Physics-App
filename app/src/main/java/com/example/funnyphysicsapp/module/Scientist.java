package com.example.funnyphysicsapp.module;

import java.util.List;

public class Scientist {

    private Integer imageId;

    private String name;

    private String bio;



    public Scientist(Integer imageId, String name, String bio) {
        this.imageId = imageId;
        this.name = name;
        this.bio = bio;

    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}
