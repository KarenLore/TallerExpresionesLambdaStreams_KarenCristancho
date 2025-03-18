package com.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("dorsal")
    private int dorsal;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("age")
    private int age;

    @JsonProperty("height")
    private int height;

    @JsonProperty("weight")
    private int weight;

    @JsonProperty("position")
    private String position;

    public Jugador() {}

    public Jugador(int dorsal, String name, String nationality, int age, int height, int weight, String position) {
        this.dorsal = dorsal;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.position = position;
    }

    public int getDorsal() { return dorsal; }
    public String getName() { return name; }
    public String getNationality() { return nationality; }
    public int getAge() { return age; }
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public String getPosition() { return position; }

    @Override
    public String toString() {
        return "Jugador{" +
                "dorsal=" + dorsal +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", position='" + position + '\'' +
                '}';
    }
}