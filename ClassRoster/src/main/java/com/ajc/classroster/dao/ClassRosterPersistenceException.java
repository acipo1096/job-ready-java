/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.dao;

/**
 *
 * @author ALEXCIP96
 */

// This class was formerly called ClassRosterDaoException
// Refactored to ClassRosterPersistence Exception to better signal the intent of the exception
// and better encapsulate the private implementation of the service layer

public class ClassRosterPersistenceException extends Exception {
    
    public ClassRosterPersistenceException(String message) {
        super(message);
    }
    
    public ClassRosterPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
