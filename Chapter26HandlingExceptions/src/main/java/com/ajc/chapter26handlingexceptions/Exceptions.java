/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter26handlingexceptions;

import java.util.Scanner;

/**
 *
 * @author ALEXCIP96
 */
public class Exceptions {

    public static void main(String[] args) {
        String input;
        
        double quotient = 0;
        int numerator = 0;
        int denominator = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        try {
            System.out.println("Please enter the numerator: ");
            input = myScanner.nextLine();
            numerator = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            System.out.println("Input could not be parsed to an integer.");
        }
        
        try {
            System.out.println("Please enter the denomintator: ");
            input = myScanner.nextLine();
            denominator = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Input could not be parsed into an integer");
        }
        
        try {
           quotient = (double) numerator/denominator;
        } catch (ArithmeticException ex) {
        }

        
        quotient = (double) numerator/denominator;
        
        System.out.println("The quotient is " + quotient);
        
    }
}
