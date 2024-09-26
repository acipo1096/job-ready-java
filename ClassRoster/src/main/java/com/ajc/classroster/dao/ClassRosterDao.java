/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ajc.classroster.dao;

import com.ajc.classroster.dto.Student;
import java.util.List;

/**
 * Lesson 31: Test Design
 * We want to design and implement tests for each method
 * We must consider the effects of each method will be on the DAO 
 * and then how we can use the other tools to help us
 * 
 * See p.587-589
 * 
 */
public interface ClassRosterDao {
    
    /**
     * Adds the given Student to the roster and associates it with the given
     * student id. If there is already a student associated with the given
     * student id it will return that student object, otherwise it will
     * return null
     * 
     * @param studentId with which student is to be associated
     * @param student student to be added to the roster
     * @return the Student object previously associated with the given
     * student id if it exists, null otherwise
     * @throws ClassRosterPersistenceException
     */
    
    
    Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException;
    
    /**
     * Returns a List of all students in the roster.
     * 
     * @return List containing all students in the roster.
     * @throws ClassRosterPersistenceException
     */
    
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    
    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists
     * 
     * @param studentId ID of the student to retrieve
     * @return the Student object associated with the given student id,
     * null if no such student exists
     * @throws ClassRosterPersistenceException
     */
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    
    /**
     * Removes from the roster the student associated with the given id.
     * Returns the student object that is being removed or null if
     * there is no student associated with the given id
     * 
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student
     * was associated with the given student id
     * @throws ClassRosterPersistenceException
     */
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
    
    
}
