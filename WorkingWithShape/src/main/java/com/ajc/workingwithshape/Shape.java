/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.workingwithshape;

/**
 *
 * @author ALEXCIP96
 */
public class Shape {
    
    protected String color;
    protected int area;
    protected int perimeter;

    public Shape() {
        System.out.println("Shape Constructor");
    }
    
    
    public void setArea(int area){
        this.area = area;
    }
    
    public int getArea() {
        return area;
    }
    
    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getPerimeter() {
        return perimeter;
    }
    
}
