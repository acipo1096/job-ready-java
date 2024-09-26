/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();
        
        populations.put("USA", 328000000);
        populations.put("Canada", 37590000);
        populations.put("United Kingdom", 66800000);
        populations.put("Japan", 126000000);
        
        System.out.println("Map size is: " + populations.size());
        
        // Listing 23.2
        Integer japanPopulation = populations.get("Japan");
        System.out.println("The population of Japan is: "  + japanPopulation);
        
        Integer ASDFPopulation = populations.get("ASDF");
        System.out.println("The population of ASDF is: " + ASDFPopulation);
        
        // Listing 23.3
        
        // Update the USA
        populations.put("USA", 328000002);
        
        // get the Set of keys from the map
        Set<String> keys = populations.keySet();
        
        // print the keys to the screen
        for (String k : keys) {
            System.out.println(k);
        }
        
        // Listing 23.4
        Set<Map.Entry<String,Integer>> entries = populations.entrySet();
        
        for (Map.Entry e: entries) {
            System.out.println("The population of " + e.getKey() + " is " + e.getValue());
            
        }
        
        // Listing 23.5
        
        // get the Collection of values from the Map
        Collection<Integer> popValues = populations.values();
        
        // list all of the population values
        for (Integer currentPopulation : popValues) {
            System.out.println(currentPopulation);
        }
    }
}
