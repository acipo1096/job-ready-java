/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Listing33_6 {
    
    public static void main(String[] args) {
        
        LocalDateTime ldt = LocalDateTime.now();
        
        System.out.println(ldt);
        
        String formatted = ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
        System.out.println(formatted);
        
    }
}
