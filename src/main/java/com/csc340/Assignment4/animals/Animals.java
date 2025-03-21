package com.csc340.Assignment4.animals;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int animalId;

    @Column(nullable = false)
    private String name;

    private String diet;

    @Column(nullable = false)
    private  String animalClass;

    private String description;

    public Animals(int animalId, String name, String diet, String animalClass, String description){
        this.animalId = animalId;
        this.name = name;
        this.diet = diet;
        this.animalClass = animalClass;
        this.description = description;
    }

    public Animals(String name, String diet, String animalClass, String description){
        this.name = name;
        this.diet = diet;
        this.animalClass = animalClass;
        this.description = description;
    }

    public Animals(){

    }

    //getter methods
    public int getAnimalId(){
        return animalId;
    }

    public String getName(){
        return name;
    }

    public String getDiet(){
        return diet;
    }

    public String getAnimalClass(){
        return animalClass;
    }

    public String getDescription() {
        return description;
    }

    //setter methods
    public void setAnimalId(int animalId){
        this.animalId = animalId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
