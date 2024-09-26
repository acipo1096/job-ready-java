/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.chapter7controllingprogramflow;

/**
 *
 * @author ALEXCIP96
 */
public class SevenFiveTernaryOperator {
    public static void main(String[] args) {
        int age = 19;
        String result = "";
        
        result = (age >= 18) ? "You can vote!" : "You are not old enough to vote.";
        System.out.println(result);
    }
}
