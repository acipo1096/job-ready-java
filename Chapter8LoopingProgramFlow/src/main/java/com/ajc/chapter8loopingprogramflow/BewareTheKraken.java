/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter8loopingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class BewareTheKraken {
    public static void main(String[] args) {
        System.out.println("Get those flippers and wetsuit on - we're going diving!");
        System.out.println("HERE WE GOOOOOOoooooo...! *SPLASH*");
        
        int depthDivedInFt = 0;
        
        // Turns out the ocean is about 36,200 feet at its deepest point, 
        // so if we reach the bottom, we should probabyl stop
        
        while (depthDivedInFt < 36200) {
            System.out.println("So far we've swum " + depthDivedInFt + " feet.");
            
            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys.....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            // I can swim really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
    }
}
