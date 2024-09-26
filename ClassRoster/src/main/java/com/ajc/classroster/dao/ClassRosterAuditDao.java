/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.classroster.dao;

/**
 * Our audit log feature will be implemented in four steps
 * 1. Creation and implementation of the Audit DAO interface and implementation class
 * 2. Changes to the service layer to write to the Audit Log when creating and removing students in the system
 * 3. Modifying the App class to create and wire the Audit DAO into the service layer
 * 4. Creating the empty audit.txt file.
 * 
 */
public interface ClassRosterAuditDao {
    
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException;
}
