/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ajc.chapter22introtolists;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEXCIP96
 */

public class App {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        
        System.out.println("List size: " + strings.size());
        
        strings.add("The First String");
        strings.add("The Second String");
        strings.add("The Third String");
        System.out.println("List size: " + strings.size());
        
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        
        List<String> strings2 = new ArrayList<>();
        
        strings2.add("Apple");
        strings2.add("Banana");
        strings2.add("Cherry");
        strings2.add("Date");
        System.out.println("List size: " + strings2.size());
        
//        for (int i = 0; i < strings2.size(); i++) {
//            System.out.println(strings2.get(i));
//        }

        // Enhanced for Loop
        for (String currentString : strings2) {
            System.out.println(currentString);
        }
        
        strings2.remove("Banana");
        
        System.out.println("List size: " + strings2.size());
        
        for (int i = 0; i < strings2.size(); i++) {
            System.out.println(strings2.get(i));
        }
    }
}
