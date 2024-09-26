/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter22introtolists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ALEXCIP96
 */
public class Iterator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        
        // Display List with an enhanced for loop
        for (String s : strings) {
            System.out.println(s);
        }
        
        // Display List with an Iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(currentString);
        }
        
    }
}
