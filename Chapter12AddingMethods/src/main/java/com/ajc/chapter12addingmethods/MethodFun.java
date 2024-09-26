/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;

/**
 *
 * @author ALEXCIP96
 */

// The num variable is a parameter passed to the silly method
// The value of num is being copied into the variable x in silly's parameter list
// When silly is running, it is using a copy of what was in num
// When the silly method ends, x goes away; however, the original num in main still exists and still retains its original value

// NOTE: num and x are two different variables and are stored in two different places by the program
// This is called passing by value; in which we are passing the value from one to the other

public class MethodFun {
    public static void main(String[] args) {
        int num = 42;
        silly(num);
    }
    
    public static void silly (int x) {
        System.out.println("My parameter is: " + x);
    }
}
