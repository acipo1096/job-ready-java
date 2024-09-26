/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter23exploringmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ALEXCIP96
 */
public class StateCapitals {
    
    public static void main(String[] args) {
        
        Map<String, String> states = new HashMap<>();
        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juneau");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        states.put("California", "Sacramento");
        states.put("Colorado", "Denver");
        states.put("Connecticut", "Hartford");
        states.put("Delaware", "Dover");
        states.put("Florida", "Tallahassee");
        states.put("Georgia", "Atlanta");
        states.put("Hawaii", "Honolulu");
        states.put("Idaho", "Boise");
        states.put("Illinois", "Springfield");
        states.put("Indiana", "Indianapolis");
        states.put("Iowa", "Des Moines");
        states.put("Kansas", "Topeka");
        states.put("Kentucky", "Frankfort");
        states.put("Louisiana", "Baton Rouge");
        states.put("Maine", "Augusta");
        states.put("Maryland", "Annapolis");
        states.put("Michigan", "Lansing");
        states.put("Minnesota", "Boston");
        states.put("Massachusetts", "St. Paul");
        states.put("Mississippi", "Jackson");
        states.put("Missouri", "Jefferson City");
        states.put("Montana", "Helena");
        states.put("Nebraska", "Lincoln");
        states.put("Nevada", "Carson City");
        states.put("New Hampshire", "Concord");
        states.put("New Jersey", "Helena");
        states.put("New Mexico", "Santa Fe");
        states.put("New York", "Albany");
        states.put("North Carolina", "Raleigh");
        states.put("North Dakota", "Bismarck");
        states.put("Ohio", "Columbus");
        states.put("Oklahoma", "Oklahoma City");
        states.put("Ohio", "Columbus");
        states.put("Oregon", "Salem");
        states.put("Pennsylvania", "Harrisburg");
        states.put("Rhode Island", "Providence");
        states.put("South Carolina", "Columbia");
        states.put("South Dakota", "Pierre");
        states.put("Tennessee", "Nashville");
        states.put("Texas", "Austin");
        states.put("Utah", "Salt Lake City");
        states.put("Vermont", "Montpelier");
        states.put("Virginia", "Richmond");
        states.put("Washington", "Olympia");
        states.put("West Virginia", "Charleston");
        states.put("Wisconsin", "Madison");
        states.put("Wyoming", "Cheyenne");
               
        // Create a Set to get the keys, the states
        Set<String> keys = states.keySet();
        
        // Print all keys
        System.out.println("STATES:");
        System.out.println("=======");
        for (String k : keys) {
            System.out.println(k);
        }
        
        System.out.println("");
        
        // Create a Collection to get the values, the state capitals
        Collection<String> stateCapitals = states.values();
        
        // Print the state capitals
        System.out.println("CAPITALS:");
        System.out.println("=========");
        for (String s : stateCapitals) {
            System.out.println(s);
        }
        
        System.out.println("");
        
        
        // Create Set to print entries
        Set<Map.Entry<String, String>> entries = states.entrySet();
            
        // Print key/value pairs 
        System.out.println("STATE/CAPITAL PAIRS:");
        System.out.println("===================");
        for (Map.Entry e : entries) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
       


    }
}
