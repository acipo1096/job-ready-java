/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33magicnumbersandenums;

/**
 *
 * @author ALEXCIP96
 */
public class Test {
    
    enum Month {JANUARY, FEBRUARY, MARCH,
        APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER 
    }
    
    public static void main(String[] args) {
        
        for (Month m : Month.values()) {
            System.out.println(m);
        }
    }
}
