/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.workingwithshape;

/**
 *
 * @author ALEXCIP96
 */
public class Circle extends Shape {
    protected int circumference;
    protected int area;

    public Circle() {
           System.out.println("Circle Constructor");
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getCircumference() {
        return circumference;
    }

    @Override
    public void setArea(int area) {
        this.area = area;
    }
    
}
