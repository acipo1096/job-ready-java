/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter9guessinggame;

import java.util.Scanner;

public class Chapter9GuessingGame {

    public static void main(String[] args) {
        
        // Declare variables
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int number = 0;
        int guess = 0;
        
        do {
            // Player one picks a number
            System.out.print("Player One, please pick a number: ");
            String playerOneNumber = sc1.nextLine();
            number = Integer.parseInt(playerOneNumber);
            
            if (number < 1 || number > 20) {
                System.out.println("Player One, your number must be between 1 and 20!");
            }
        } while (number < 1 || number > 20);
        
        
        while (guess != number) {
            // Player two guesses a number
            System.out.print("Ok Player Two, what's your guess? ");
            String playerTwoNumber = sc2.nextLine();
            guess = Integer.parseInt(playerTwoNumber);
            
            if (guess < 1 || guess > 20)  {
                System.out.println("Player Two, please select a number between 1 and 20.");
            } else if (guess < number) {
                System.out.println("Sorry, Player Two, try again! Your next guess should be a higher number.");
            } else if (guess > number) {
                System.out.println("Sorry, Player Two, try again! Your next guess should be a lower number.");
            }
        }
        
        System.out.println("Player Two selected the right number, " + number + "! You win!");
        System.out.println("Thanks for playing!");        
    }
}
