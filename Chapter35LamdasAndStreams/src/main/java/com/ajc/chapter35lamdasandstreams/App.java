/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter35lamdasandstreams;

// Below, we make a multiline lambda using curly braces
// to print the name on one line and the age on the next

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        
        // Creates a list of several Person objects using the Person class
        // Prints the list using an enhanced for loop
        List<Person> people = new ArrayList();
        
        people.add(new Person("Alfred", 17));
        people.add(new Person("Henrey", 18));
        people.add(new Person("George", 19));
        people.add(new Person("Joe", 27));
        people.add(new Person("Zelda", 7));
        
        for (Person currentPerson : people) {
            System.out.print(currentPerson.getName());
            System.out.print(" - ");
            System.out.println(currentPerson.getAge());
        }
        
        System.out.println("======");
        
        // The stream() and forEach() method selects each person
        // then uses three lines to print out the values for the name and age
        // with a dash in the middle
        
        people.stream()
                .forEach((currentPerson) -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });
    }
}

/**
 * When we use a multiline lambda, we need to include a semicolon at the end 
 * of lines and return statement if the functional interface has a return value.
 * 
 * If we use a multiline lambda in a filter or map, we also need to make sure 
 * to return a value from the lambda
 * 
 * The return is assumed on the single-statement lambdas, but is required in 
 * multistatement lambdas
 */