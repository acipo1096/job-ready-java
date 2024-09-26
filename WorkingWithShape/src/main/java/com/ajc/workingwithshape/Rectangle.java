/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.workingwithshape;

/**
 *
 * @author ALEXCIP96
 */
public class Rectangle extends Shape {
    protected int height;
    protected int width;

    public Rectangle() {
        System.out.println("Rectangle Constructor");
    }    

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
