/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter24simplefileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Random;

public class StateGuessingGame {
    
    // Declare a delimiter to read from the file
    public static final String DELIMITER = "::";
    
    public static void main(String[] args) throws Exception {
        
        Random randomizer = new Random();
        
        // Set variable to determine if the game is over
        boolean gameOver = false;
       
        // Create a scanner to read from the file
        Scanner sc = new Scanner(
            new BufferedReader(new FileReader("states.txt")));
        
        // Create a scanner to hold a user's guess for a capital
        Scanner userGuess = new Scanner(System.in);
        
        // create new Map
        Map<String, String> states = new HashMap<>();        
        
        // go through the file line by line
        // and put each state and state capitals into the states Map
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] stateArr = currentLine.split(DELIMITER);
            String stateName = stateArr[0];
            String stateCapital = stateArr[1];
            states.put(stateName, stateCapital);
        }
        
        // Create a new List to hold the keys, the states
        List stateNames = new ArrayList<>(states.keySet());
        
        // Create a second list to hold the values, the state capitals
        List stateCapitals = new ArrayList<>(states.values());

        // Initializes an integer to be randomly used to get a random state from the stateNames List
        int randomState = randomizer.nextInt(stateNames.size());

        // Create an object to hold the state that will correspond with the appropriate capital
        Object correspondingState = stateNames.get(randomState);
        
        System.out.println("Let's play the STATE GUESSING GAME!!!");
        System.out.println("You will be presented with a state. Guess the correct capital to win!");
        System.out.println("To opt out, type 'I don't know'I  as your answer.");
        while (gameOver == false ) {
            System.out.println("WHAT IS THE CAPITAL OF " + correspondingState + "?");
            String answer = userGuess.nextLine();
            
            // Compare the user's answer to the correct answer
            // If correct, the game ends
            // If not, the game continues
            if (answer.equals(stateCapitals.get(randomState))) {
                System.out.println("NICE WORK! " + answer + " IS CORRECT!");
                gameOver = true;
                break;
            } else if (answer.equals("I don;t know")) {
                System.out.println("THE CORRECT ANSWER WAS " + stateCapitals.get(randomState) + ". THANKS FOR PLAYING!");
                gameOver = true;
            } 
            else {
                System.out.println("SORRY, THAT IS INCORRECT. TRY AGAIN!");
            }         
        }

  
        
        
        
        
        
        
        
    }
}
