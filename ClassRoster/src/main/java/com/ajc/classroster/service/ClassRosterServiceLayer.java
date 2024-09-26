/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.classroster.service;

import com.ajc.classroster.dao.ClassRosterPersistenceException;
import com.ajc.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author ALEXCIP96
 */
public interface ClassRosterServiceLayer {
    
    void createStudent(Student student) throws 
            ClassRosterDuplicateIdException, 
            ClassRosterDataValidationException, 
            ClassRosterPersistenceException;
    
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
    
    // Exceptions are created in the same package that potentially throws them
    // So, the exceptions thrown by the service layer are in the service package
    // and the exception thrown by the DAO is in the dao package
}
