/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.classroster.ui;

/**
 *
 * @author ALEXCIP96
 */
public interface UserIO {
    
    // Print a given string to the console
    void print(String msg);
    
    // Display a given message String to prompt the user to enter in a double and then read in the user response and return that double
    double readDouble(String prompt);
    
    // Display a prompt to the user to enter a double between a specified min and max range and read in a double
    // The prompt message and min/max values should be passed in as parameters
    // The value read in from the console should be the return of the method
    double readDouble (String prompt, double min, double max);
    
    float readFloat(String prompt);
    
    float readFloat(String prompt, float min, float max);
    
    int readInt(String prompt);
    
    int readInt(String prompt, int min, int max);
    
    long readLong(String prompt);
    
    long readLong(String prompt, long min, long max);
    
    String readString(String prompt);
    
    public void close();
}
