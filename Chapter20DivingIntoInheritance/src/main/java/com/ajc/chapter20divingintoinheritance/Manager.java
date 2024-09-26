/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter20divingintoinheritance;

/**
 *
 * @author ALEXCIP96
 */
public class Manager extends Employee {

    public Manager() {
        super(); // not necessary to write
        // super() is implicitly added here by the compiler
        // as the first statement of the constructor
        
        System.out.println("Manager Constructor");
    }
    
    Manager(int aValue) {
        // super() - without parameters - is implicitly added here by the 
        // compiler as the first statement of the constructor
        System.out.println("Manager Constructor with Argument");
    }
    
    
    
    public void hire() {
        // code to hire someone...
    }
    
    public void fire() {
        // code to fire someone
    }
    
    public void givePerformanceReview() {
        // code to give performance review
    }
    
    // Listing 20.5
    @Override
    public void createYearlyObjectives() {
        // we're overriding the version of this method in Employee
        // put new code here...
        
        // Listing 20.6
        super.createYearlyObjectives();
        // put new code here
    }
}

// The above specific methods are included here
// but all the members of Employee are included in Manager