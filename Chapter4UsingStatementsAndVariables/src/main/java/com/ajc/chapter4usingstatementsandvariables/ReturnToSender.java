/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter12addingmethods;

/**
 *
 * @author ALEXCIP96
 */
public class ReturnToSender {
    public static void main(String[] args) {
        ??? aMystery = mystery();
        ??? totallyUnexpected = unexpected();
        ??? aSurprise = surprise();
        ??? itsClassified = classified();
        ??? aSecret = secret();
        
        System.out.println("The methods have returned! Their results...\n");
        System.out.println("Mysterious: " + aMystery);
        System.out.println("    Secret: " + aSecret);
        System.out.println("Surprising: " + aSurprise);
        System.out.println("Classified  " + itsClassified);
        System.out.println("Unexpected: " + totallyUnexpected);
    }
    
    public static int secret() {
        return 42;
    }
    
    public static double surprise(){
        return 3.14;
    }
    
    public static char mystery(){
        return 'X';
    }
    
    public static boolean classified(){
        return true;
    }
    
    public static String unexpected(){
        return "Spanish Inquisition";
    }
}
