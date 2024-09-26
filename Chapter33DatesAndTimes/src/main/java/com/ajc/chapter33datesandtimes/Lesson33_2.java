/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter33datesandtimes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lesson33_2 {
    public static void main(String[] args) {
        
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        
        // ISO 8601 string
        ld = LocalDate.parse("2021-03-01");
        System.out.println(ld);
        
        // Different format other than ISO 8601
        // DateTimeFormatter uses a capital M for months and lowercase m for minutes
        ld = LocalDate.parse("02/07/2021", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(ld);
    }
}
