/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;

/**
 *
 * @author ALEXCIP96
 */
public class MethodFunDebugging {
    
    public static void main(String[] args) {
        
        int num = 42;
        doIt(num);
        doIt(num);
        doIt(num);
    }

    public static void doIt(int x) {
        System.out.println("My number is: " + x);
    }
}
