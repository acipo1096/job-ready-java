/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter8loopingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class ACountingNumbers {
    public static void main(String[] args) {
        int counter = 1; 
        while (counter <= 5) {
            System.out.println("Counting: " + counter);
            counter++;
        }
        
        System.out.println("...Done!");
    }
}
