/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.objectinstantiation;

/**
 *
 * @author ALEXCIP96
 */
public class App {
    
    // Main method
    public static void main(String[] args) {
        
        // We have type Adder
        // Variable name is myAdder
        // We set the variable equal to a new Adder object by called new and the Adder constructor, Adder()
        
        // In other words, we're telling the Java Runtime to create a new object based on this adder template
        // and hand back a reference
        
        // Comment out if add is static
//        Adder myAdder = new Adder();
        
        // If add is static, it no longer makes sense to create a specific instance of the Adder class, hence the warning
        // Comment out if add is static
//        int sum = myAdder.add(4, 5);

        // We need the Adder name because the static method is still associated with the class
        int sum = Adder.add(4,5);


        System.out.println("The sum is " + sum);
    }
}
