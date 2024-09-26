/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter35lamdasandstreams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEXCIP96
 */
public class AppFilterStream {
    
    public static void main(String[] args) {
        
        // We set up a list of Person objects called people
        List<Person> people = new ArrayList();

        people.add(new Person("Alfred", 17));
        people.add(new Person("Henrey", 18));
        people.add(new Person("George", 19));
        people.add(new Person("Joe", 27));
        people.add(new Person("Zelda", 7));
        
        // We filter based on age >= 18
        System.out.println("==> Age 18 or greater ==");
        people.stream()
                .filter((currentPerson) -> 
                            currentPerson.getAge() >= 18)
                .forEach((currentPerson) -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });
        
        // We filter based on name starting with G
        System.out.println("==> Names start with G ==");
        people.stream()
                .filter((currentPerson) -> 
                            currentPerson.getName().startsWith("G"))
                .forEach((currentPerson) -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });

    }
}
        
