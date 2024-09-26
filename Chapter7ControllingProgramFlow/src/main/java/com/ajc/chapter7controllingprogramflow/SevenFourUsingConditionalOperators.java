/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter7controllingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class SevenFourUsingConditionalOperators {
    public static void main(String[] args) {
        int age = 19;
        boolean registered = true;
        
        // see if a person can vote!
        if (age >= 18 && registered == true) {
            System.out.println("You can vote!");
        }
        
        // see if they are not allowed to vote!
        if(age < 18 || registered != true) {
            System.out.println("You are not eligible to vote!");
        }
    }
}
