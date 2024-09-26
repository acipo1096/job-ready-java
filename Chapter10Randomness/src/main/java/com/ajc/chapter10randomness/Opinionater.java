/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter10randomness;

import java.util.Random;

public class Opinionater {
    public static void main(String[] args) {
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best...");
        System.out.println("I know! Random can decide FOR ME!");
        
        int x = randomizer.nextInt(6);
        
        System.out.println("The number we chose was: " + x);
        
        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly mammoths are the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are the best!");
                break;
            case 5:
                System.out.println("NAKED MOLE-RATS are the best!");
                break;
        }
        
        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}
