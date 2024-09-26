/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;

import java.util.Scanner;

/**
 *
 * @author ALEXCIP96
 */
public class WindowMasterRefactored {

    public static void main(String[] args) {
        // Declare variables for height and width
        float height;
        float width;
        
        // Declare String variables to hold the user's height and width input
        String stringHeight;
        String stringWidth;
        
        // Declare other variables
        float windowArea;
        float cost;
        float windowPerimeter;
                
        // Declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        height = readValue("Please enter window height: ");
        width = readValue("Please enter window width: ");
        
//        OLD CODE        
//        System.out.print("Please enter window height: ");
//        stringHeight = myScanner.nextLine();
//        System.out.print("Please enter window width: ");
//        stringWidth = myScanner.nextLine();
  
//        OLD CODE
//        // convert String values of height and width to float values
//        height = Float.parseFloat(stringHeight);
//        width = Float.parseFloat(stringWidth);
        
        // Calculate the area of the window
        windowArea = height * width;
        
        // Calculate the perimeter of the window
        windowPerimeter = 2 * (height + width);
        
        // Calculate the total cost - use a hard-coded value for material cost
        cost = ((3.50f * windowArea) + (2.25f * windowPerimeter));
        
        // Display the results to the user
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + windowArea);
        System.out.println("Window perimeter " + windowPerimeter);
        System.out.println("Total cost = " + cost);
        
    }
    
    // Our new method
    public static float readValue(String prompt) {
        // declare and initialize a Scanner variable
        Scanner myScanner = new Scanner(System.in);
        
        // print prompt to console
        System.out.println(prompt);
        
        // read value into String data type
        String input = myScanner.nextLine();
        
        // convert the String to a float
        float floatVal = Float.parseFloat(input);
        
        // return the float value
        return floatVal;
    }
}
