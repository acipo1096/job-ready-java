/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.workingwithshape;

/**
 *
 * @author ALEXCIP96
 */
public class Square extends Shape {

    public Square() {
        System.out.println("Square Contstructor");
    }
    
    protected int height;
    protected int width;
    
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
