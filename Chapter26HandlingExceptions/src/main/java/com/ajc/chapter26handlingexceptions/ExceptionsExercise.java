/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter26handlingexceptions;

import java.util.Scanner;

public class ExceptionsExercise {
    public static void main(String[] args) {
        String input;

        double quotient = 0;
        int numerator = 0;
        int denominator = 0;

        Scanner myScanner = new Scanner(System.in);
        
        boolean isInt = true;

        do {
            try {
                System.out.println("Please enter the numerator: ");
                input = myScanner.nextLine();
                numerator = Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException e) {
                isInt = false;
                System.out.println("Input could not be parsed to an integer.");
            }

            try {
                System.out.println("Please enter the denominator: ");
                input = myScanner.nextLine();
                denominator = Integer.parseInt(input);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Input could not be parsed into an integer");
                isInt = false;
            }
            
        } while (numerator < 0 || denominator < 0 || isInt == false);


        try {
            quotient = (double) numerator / denominator;
        } catch (ArithmeticException ex) {
        }

        quotient = (double) numerator / denominator;

        System.out.println("The quotient is " + quotient);
    }
}
