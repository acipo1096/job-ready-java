/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter7controllingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class SevenNineComparingTwoStrings {
    public static void main(String[] args) {
        
        String stringOne = "apples";
        String stringTwo = "bananas";
        String stringThree = "grapes";
        
        int result = 0;
        
        result = stringOne.compareTo(stringTwo);
        if (result == 0) {
            System.out.println(stringOne + " equals " + stringTwo);
        } else if (result < 0){
            System.out.println(stringOne + " is less than (before) " + stringTwo);
        } else {
            System.out.println(stringOne + " is greater than (after) " + stringTwo);
        }
        
        result = stringThree.compareTo(stringTwo);
        if (result == 0) {
            System.out.println(stringThree + " equals " + stringTwo);
        } else if (result < 0) {
            System.out.println(stringThree + " is less than (before) " + stringTwo);
        } else {
            System.out.println(stringThree + " is greater than (after) " + stringTwo);
        }
    }
}
