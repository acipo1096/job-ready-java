/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.service;

/**
 *
 * @author ALEXCIP96
 */
public class ClassRosterDataValidationException extends Exception {
    
    public ClassRosterDataValidationException(String message) {
        super(message);
    }
    
    public ClassRosterDataValidationException (String message, Throwable cause) {
        super(message, cause);
    }
}
