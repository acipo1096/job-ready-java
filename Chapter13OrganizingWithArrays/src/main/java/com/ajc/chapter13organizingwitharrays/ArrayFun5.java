/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class ArrayFun5 {
    public static void main(String[] args) {
        
        // Print only the odd numbered indexes from back to front
        int[] numbers = {3,5,2,1,10,42};
        // start at last index, go to first (0)
        for (int ctr = numbers.length - 1; ctr >= 0; ctr--) { // if we have a remainder, then we know the index is odd
            if (ctr % 2 == 1) {
                System.out.println("index " + ctr + " - " + numbers[ctr]);
            }
        }
    }
}
