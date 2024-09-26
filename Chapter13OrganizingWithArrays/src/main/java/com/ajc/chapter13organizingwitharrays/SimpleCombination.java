/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter13organizingwitharrays;

/**
 *
 * @author ALEXCIP96
 */

// Combine both arrays into one new array
public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3,7,9,10,16,19,20,34,35,45,47,49};
        int[] secondHalf = {51,54,68,71,75,78,82,84,85,89,91,100};
        
        int[] wholeNumbers = new int[24];

        combineArrays(firstHalf, secondHalf, wholeNumbers);
        
        System.out.println("Here is the firstHalf array, with a length of " + firstHalf.length);
        for (int i = 0; i < firstHalf.length; i++) {
            System.out.println(firstHalf[i]);
        }
        
        System.out.println("Here is the secondHalf array, with a length of " + secondHalf.length);
        for (int i = 0; i < secondHalf.length; i++) {
            System.out.println(secondHalf[i]);
        }
        
        System.out.println("All together now!:");
        for (int i = 0; i < wholeNumbers.length; i++) {
            System.out.print(wholeNumbers[i] + " ");
        }

    }
    
    public static int[] combineArrays(int[] arrayOne, int [] arrayTwo, int[] newArray) {
//        int[] combinedArray = new int[24];
        
        for (int i = 0; i < arrayOne.length; i++) {
            newArray[i] = arrayOne[i];
        }

        for (int i = arrayOne.length; i < newArray.length; i++) {
            newArray[i] = arrayTwo[i-arrayOne.length];
        }
        
        
        return newArray;
    }
    
}

