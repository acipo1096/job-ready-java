/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;
import java.util.Random;

/**
 *
 * @author ALEXCIP96
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor();
        int weight = randomInteger(5,200);
        int distance = randomInteger(10, 20);
        int number = randomInteger(10000,20000);
        int time = randomInteger(2, 6);
        
        
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + color + ", " +
                weight + " lb miniature " + animal + " for over " +
                distance + " miles!!");
        
        System.out.println("I had to hide in a field of over " + 
                number + " " + colorAgain + " poppies for nearly " + 
                time + " hours until it left me alone.");
        
        System.out.println("\nIt was QUITE the experience, " 
            + "let me tell you!");
    }
        
    // Write a method that returns a randomly chosen color
    public static String randomColor(){
        Random rng = new Random();
        int randomInt = rng.nextInt(6) + 1;
        String color = "";
        
        switch (randomInt) {
            case 1: 
                color = "red";
                break;
            case 2:
                color = "yellow";
                break;
            case 3:
                color = "green";
                break;
            case 4:
                color = "blue";
                break;
            case 5:
                color = "purple";
                break;
            default:
                color = "Where's the color?";
                break;
        }
        
        return color; 
    }
    // Write a method that returns a randomly chosen animal
    public static String randomAnimal() {
        Random rng = new Random();
        int randomInt = rng.nextInt(6) + 1;
        String animal = "";

        switch (randomInt) {
            case 1:
                animal = "cheetah";
                break;
            case 2:
                animal = "lion";
                break;
            case 3:
                animal = "hippopotamus";
                break;
            case 4:
                animal = "mouse";
                break;
            case 5:
                animal = "dodo bird";
                break;
            default:
                animal = "Where's the animal?";
        }

        return animal;
    }
    
    // Write a method that returns a randomly chosen integer
        public static int randomInteger(int min, int max){                       
            Random rng = new Random();
            int randomInt = rng.nextInt((max - min) + 1) + min;
            
            // What I thought would work, int randomNumber = range.nextInt(max) + min, doesn't work
            // It gives me numbers larger than the max
            
            // According to ChatGPT:
            /*
            The `+1` is added to ensure that the upper bound (`max`) is inclusive in the range. 

            Here's a detailed explanation:

            - `rng.nextInt(bound)` generates a random integer between 0 (inclusive) and `bound` (exclusive).
            - To generate a random integer between `min` and `max` (inclusive), we need to specify the bound as `(max - min + 1)`.
              - This is because `(max - min)` gives the difference between `max` and `min`, but this difference is exclusive of the upper bound.
              - Adding `1` makes the upper bound inclusive. 

            For example, if `min = 5` and `max = 10`:
            - `max - min = 10 - 5 = 5`
            - `rng.nextInt(5)` generates a random integer from 0 to 4.
            - Adding `min` shifts this range to 5 to 9, which doesn't include 10.

            By adding `1`:
            - `rng.nextInt((max - min) + 1) = rng.nextInt(6)`
            - This generates a random integer from 0 to 5.
            - Adding `min` shifts this range to 5 to 10, which includes the upper bound `max`.            
            */
            
            // Got it!

            return randomInt; 
        }
}
