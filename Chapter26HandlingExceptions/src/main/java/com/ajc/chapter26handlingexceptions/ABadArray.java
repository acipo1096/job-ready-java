/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter26handlingexceptions;

import java.util.Scanner;

/**
 *
 * @author ALEXCIP96
 */
public class ABadArray {
    public static void main(String[] args) {
        
        String input;
        int userPick = 0;
        String[] animals = {"cat", "dog", "squirrel", "frog", "hamster", "pig", "goat", "horse"};
        
        Scanner myScanner = new Scanner(System.in);
        
        // Display Animals
        for (int ctr = 0; ctr < animals.length; ctr++) {
            System.out.println( (ctr + 1) + " - " + animals[ctr]);
        }
        
        System.out.println("-----------------------------");
        System.out.println("Which pet would you like?");
        System.out.println("Pick a pet number: ");
        
        try {
            // Get input from user
            input = myScanner.nextLine();
            userPick = Integer.parseInt(input);

            // Display user's choice
            System.out.println("You picked " + animals[userPick]);
        } catch (NumberFormatException e) {
            System.out.println("Pet selection failed. You didn't choose a number!!!");
        }
        
    }
}
