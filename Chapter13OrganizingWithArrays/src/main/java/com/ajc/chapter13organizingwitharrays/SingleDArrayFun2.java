/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class SingleDArrayFun2 {
    public static void main(String[] args) {
        
        // Iterating through a single array
        // Remember, an array's length is always 1 less than the highest index of the array
        int [] numbers = new int[] {3,5,2,0};
        
        System.out.println("Starting...");
        for (int ctr = 0; ctr < numbers.length; ctr++ ) {
            System.out.println("ctr = " + ctr + " Numbers = " + numbers[ctr]);
        }
        System.out.println("Done!");
    }
}
