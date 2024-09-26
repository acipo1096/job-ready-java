
package com.ajc.chapter11debugging;

import java.util.Scanner;

public class WindowMasterDebugging {

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
        System.out.print("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.print("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        
        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // Calculate the area of the window
        windowArea = height * width;
        
        // Calculate the perimeter of the window
        windowPerimeter = 2 * (height + width);
        
        // Calculate the total cost - use a hard-coded value for material cost
        cost = ((3.50f * windowArea) + (2.25f * windowPerimeter));
        
        // Display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + windowArea);
        System.out.println("Window perimeter " + windowPerimeter);
        System.out.println("Total cost = " + cost);
        
    }
}

    
