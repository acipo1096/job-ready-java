/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter35lamdasandstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ALEXCIP96
 */
public class AppStreamCollect {
    public static void main(String[] args) {
        
        // We set up a list of Person objects called people
        List<Person> people = new ArrayList();

        people.add(new Person("Alfred", 17));
        people.add(new Person("Henrey", 18));
        people.add(new Person("George", 19));
        people.add(new Person("Joe", 27));
        people.add(new Person("Zelda", 7));
        people.add(new Person("Zoe", 27));
        
        // Create the stream method
        // and filter() our desired criteria
        List<Person> oldPeople = people.stream()
                .filter((p) -> p.getName()
                 // puts the remaining things in the stream into a List
                .startsWith("Z")).collect(Collectors.toList());
                
        oldPeople.stream()
                .forEach((currentPerson) -> {
                    System.out.print(currentPerson.getName());
                    System.out.print(" - ");
                    System.out.println(currentPerson.getAge());
                });
        
        // When we assign the filtered stream back into a List,
        // the original List people will not change
        // The act of streaming a List will not change the original List
    }
}
