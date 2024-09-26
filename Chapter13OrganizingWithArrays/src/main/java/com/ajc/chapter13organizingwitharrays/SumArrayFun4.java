/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class SumArrayFun4 {
    public static void main(String[] args) {
        
        int[] numbers = {3,5, 2, 1, 10, 42, 100 };
        int sum = 0;
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            sum += numbers[ctr];
            System.out.println("ctr = " + " current sum = " + sum);
        }
        System.out.println("Final sum: " + sum);
    }
}
