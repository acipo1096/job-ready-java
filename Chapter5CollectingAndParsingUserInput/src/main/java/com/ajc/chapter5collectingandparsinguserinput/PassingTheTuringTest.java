/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter5collectingandparsinguserinput;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user, color, fruit;
        int number;

        
        System.out.println("Hello there!");
        System.out.print("What's your name: ");
        user = scanner.nextLine();
        
        System.out.println("Hi " + user + "! I'm Alex");
        System.out.print("What's your favorite color? ");
        color = scanner.nextLine();
        
        System.out.println("Huh, " + color + "? Mine's Granny Smith Apple.");
        System.out.print("I really like apples. They're my favorite fruit, too. What's yours? ");
        fruit = scanner.nextLine();
        
        System.out.println("Really, " + fruit + "? That's wild!");
        System.out.print(user + ", speaking of favorites, what's your favorite number? ");
        number = scanner.nextInt();
        
        System.out.println(number + " is a cool number. Mine is -7.");
        System.out.println("Well, nice talking to you, " + user);
        
    }
}
