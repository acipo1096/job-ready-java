/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class ArrayFun6 {
    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,4,5,6};
        
        // We want to print pairs of elements, skipping one number in between each pair
        for (int i = 0; i < numbers.length-2 ; i += 3 ) {
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
        }
    }
}

// KEY IDEAS
// 1. For each printout, we include two numbers and skip one. This means using three elements in each loop. Our increment must be i += 3
// 2. Since we are reading three elements in, we need to stop earlier than the length. 
// 3. We can use an expression as an index [i + 1]
