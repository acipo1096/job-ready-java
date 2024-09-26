/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter20divingintoinheritance;

/**
 *
 * @author ALEXCIP96
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Create an employee: ");
        Employee employee = new Employee();
        System.out.println("Create a manager: ");
        Manager manager = new Manager();
        System.out.println("Done");
    }    
}

// When the Manager was instantiated, its constructor was called
// But the constructor of the base class was also called first
// because an implicit call the suoer() was executed at the beginning of the manager's constructor