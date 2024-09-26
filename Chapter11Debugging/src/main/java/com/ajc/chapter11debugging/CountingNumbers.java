/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter11debugging;

/**
 *
 * @author ALEXCIP96
 */
public class CountingNumbers {
    public static void main(String[] args) {
        int counter;
        
        for (counter = 0; counter < 21; counter = counter + 2) {
            System.out.println(counter);
            // counter should have been set to an odd number i.e. 1
        }
        
        System.out.println("...Done!");
    }
}
