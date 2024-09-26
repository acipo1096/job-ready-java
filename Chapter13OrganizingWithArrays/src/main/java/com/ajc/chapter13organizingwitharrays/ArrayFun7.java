/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */
public class ArrayFun7 {
    
    // We can't change an array's size post-initialization...but we can intialize a larger, new array and copy things over
    
    public static void main(String[] args) {
        
        int[] numbers = {3,5,2,1};
        
        for (int i = 0; i < numbers.length; i++){
            System.out.println("ctr = " + i + " current sum " + numbers[i]);
        }
        System.out.println("Number of items: " + numbers.length);
        
        numbers = growArray(numbers, 5);
        
        for (int i = 0; i < numbers.length;i++) {
            System.out.println("i = " + i + " current value = " + numbers[i]);
        }
        System.out.println("Number of items: " + numbers.length);
    }
    
    // We pass the name of our array to this method along with an integer indicating how many more elements we want added
    public static int[] growArray(int[] original, int howManyMoreElements) {
        int[] newArray = new int[original.length + howManyMoreElements];
        
        for (int i = 0; i < original.length; i++) {
            // copy the element at the current index
            // from original to newArray
            newArray[i] = original[i];
        }
        return newArray;
    }
}
