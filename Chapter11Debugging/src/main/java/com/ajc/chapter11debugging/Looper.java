/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter11debugging;

/**
 *
 * @author ALEXCIP96
 */
public class Looper {
    public static void main(String[] args) {
        int counter = 10;
        
        for (int looper = 1; looper < 10; looper++) {
            if (counter < 10) {
                // put a breakpoint on the following line
                System.out.println("Counter is less than 10!");
            } else {
                System.out.println("Counter is greater or equal to 10!");
            }
            System.out.println(counter);
        }
    }
}
