/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter7controllingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class SevenOneDayOfWeek {
    public static void main(String[] args) {
        int day = 4;
        String dayName = "";
        
        if (day == 1) {
            dayName = "Monday";
        }
        if (day == 2) {
            dayName = "Tuesday";
        }
        if (day == 3) {
            dayName = "Wednesday";
        }
        if (day == 4) {
            dayName = "Thursday";
        }
        if (day == 5) {
            dayName = "Friday";
        }
        if (day == 6) {
            dayName = "Saturday";
        }
        if (day == 7) {
            dayName = "Sunday";
        }
        
        System.out.println("The day is " + dayName);

    }
}
