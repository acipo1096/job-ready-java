/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chaper15creatingclassesandtypes;

/**
 *
 * @author ALEXCIP96
 */
public class DogWithConstructor {
    
    private String name;
    private double weight;
    
    // This is the default constructor
    public DogWithConstructor() {
        
    }
    
    // This is a constructor that takes name and weight params
    public DogWithConstructor(String nameIn, double weightIn) {
        this.name = nameIn;
        this.weight = weightIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void bark() {
        System.out.println("WOOF!");
    }

    public void sit() {
        System.out.println("Sitting...");
    }
}

// Because the Dog class has two constructors
// We have two options for creating a Dog object - an object with no arguments or an object with two params