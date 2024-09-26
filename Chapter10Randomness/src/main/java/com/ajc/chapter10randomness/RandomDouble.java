/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter10randomness;

import java.util.Random;

public class RandomDouble {
    public static void main(String[] args) {
        Random rng = new Random();

        double min = 7.5;
        double max = 13.2;

        double range = max - min;

        double zeroToOne = rng.nextDouble(); // generates a number between 0 and 1

        double stepOne = zeroToOne * range; // adjusting the range
        double stepTwo = stepOne + min;	// shifting the range
        
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
        
        System.out.println("Range is " + range);
        
        System.out.println("zeroToOne is " + zeroToOne);
        
        System.out.println("Step One result is " + stepOne); 
        System.out.println("Step Two result is " + stepTwo);
    }
}
