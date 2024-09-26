/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class ArrayFun {
    public static void main(String[] args) {
        int ourNumber = 0;
        int[] numbers = new int[]{3,5,2,0};
        
        System.out.println("Our Numbers: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("ourNumber: " + ourNumber);
        
        numbers[1] = 9;
        ourNumber = numbers[0];
        
        System.out.println("Our Numbers Now: ");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println("ourNumber: " + ourNumber);
        
    }
}
