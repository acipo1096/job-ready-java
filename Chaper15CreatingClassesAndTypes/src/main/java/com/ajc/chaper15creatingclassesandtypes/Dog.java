/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chaper15creatingclassesandtypes;

/**
 *
 * @author ALEXCIP96
 */
public class Dog {
    
    private String name;
    private double weight;
    
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

// The Dog class has two properties, name and weight
// It also has several methods - getters, setters, bark(), and sit()