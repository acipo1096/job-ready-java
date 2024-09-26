/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter20divingintoinheritance;

/**
 *
 * @author ALEXCIP96
 */
public class Employee {
    protected String firstName;
    protected String lastName;
    
    Employee() {
        System.out.println("Employee Constructor");
    }
    
    public void doWork() {
        // code to do work...
    }
    
    public void createYearlyObjectives() {
        // code to create yearly objectives
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

// All employees have these capabilities, no matter their role
// Many employees have additional capabilities; a manager, for example, can hire and fire
// A manager is also a special kind of employee, where it inherits some common properties and behaviors
// and extends the functionality of what an employee does with new and/or different properties and behaviors
