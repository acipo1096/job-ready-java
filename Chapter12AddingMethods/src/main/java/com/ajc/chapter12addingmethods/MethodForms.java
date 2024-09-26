/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;

/**
 *
 * @author ALEXCIP96
 */
public class MethodForms {
    // If we don't pass in all the parameters, we'll get an error!
    public static void main(String[] args) {
        sayHello ("Bob", "Sue");
    }
    
    public static void sayHello (String a, String b) {
        System.out.println("Hello " + a + " and " + b);
    }
}
