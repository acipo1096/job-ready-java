/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter5collectingandparsinguserinput;

import java.util.Scanner;

public class QuestForTheUserInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        
        System.out.print("What is your name?? ");
        yourName = inputReader.nextLine();
        
        System.out.print("What is your quest?! ");
        yourQuest = inputReader.nextLine();
        
        // When we get to our double data type, we can use Scanner's 
        // nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String
        
        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct " + yourName + "?");
    }
}
