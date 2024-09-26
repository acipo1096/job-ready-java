/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Listing33_10 {
    
    public static void main(String[] args) {
        
        LocalDate ld;
        Date legacyDate = new Date();
        
        // Step 1
        ZonedDateTime zdt = ZonedDateTime.ofInstant(legacyDate.toInstant(), ZoneId.systemDefault());
        
        // Step 2
        ld = zdt.toLocalDate();
        
        System.out.println(legacyDate);
        System.out.println(ld);
        
    }
}
