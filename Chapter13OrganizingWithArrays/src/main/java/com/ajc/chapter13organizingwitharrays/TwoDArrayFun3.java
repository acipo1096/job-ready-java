/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class TwoDArrayFun3 {
    public static void main(String[] args) {
        
        // This is a 3 x 3 array
        String[][] words = {{"One", "Two", "three" },
                {"red", "white", "blue" },
                {"cat", "rabbit", "cow"}};
        
        System.out.println("Starting...");
        
        // This for loop gives us the length of words
        for (int i = 0; i < words.length; i++) {
            
            // This nested loop checks the length of each item within that dimension
            for (int j = 0; j < words[i].length; j++) {
                System.out.println("i = " + i + " j = " + j + " is " + words[i][j]);
            }
            System.out.println("-----");
        }
    }
}
