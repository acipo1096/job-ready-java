/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter4usingstatementsandvariables;

/**
 *
 * @author ALEXCIP96
 */
public class BucketsOfFun {
    public static void main(String[] args) {
        // Declare ALL THE THINGS
        // Usually, it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;
        
        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies.");
        System.out.println("But there are " + bugs + " bugs in all.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...wait a minute.");
        
    }
    
}
