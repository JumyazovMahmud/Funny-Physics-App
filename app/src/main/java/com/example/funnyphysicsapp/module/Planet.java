package com.example.funnyphysicsapp.module;

public class Planet {

    private String name;

    private String info;

    private String planetColor;


    public Planet() {

    }

    public Planet(String name, String info, String planetColor) {
        this.name = name;
        this.info = info;
        this.planetColor = planetColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getColor() {
        return planetColor;
    }

    public void setPlanetColor(String color) {
        this.planetColor = color;
    }
}
