/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter10randomness;

import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again " + num + ", " + num);
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0-100: ");
        
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
        System.out.println("What if we do nextInt(51) + 50?");
        System.out.print(randomizer.nextInt(51)+50  + ", ");
        System.out.print(randomizer.nextInt(51)+50 + ", ");
        System.out.println(randomizer.nextInt(51)+50);
        
        System.out.println("What if we include randomness in a math statement?");
        int mathRandom = randomizer.nextInt(101);
        System.out.println(25 + mathRandom + ". The random number was " + mathRandom);
        

    }
}
