/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ajc.classroster.service;

import com.ajc.classroster.dao.ClassRosterAuditDao;
import com.ajc.classroster.dao.ClassRosterDao;
import com.ajc.classroster.dao.ClassRosterPersistenceException;
import com.ajc.classroster.dto.Student;
import java.util.List;

/* 
* To use the Audit DAO, we need to modify the service layer to use it
* 1. Add a member field of type ClassRosterAuditDao
* 2. Modify the ClassRosterServiceLayerImpl constructor so that it initializes the ClassRosterAuditDao member field
* 3. Modify the createStudent method to write an audit log message when a student is successfully created
* 4. Modify the removeStudent method to write an audit log message when a student is removed.
*/

public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {
    
    // This service later needs to use the DAO for Student object CRUD operations
    // so we will add a member field type of ClassRosterDao to our service implementation layer
    
    private final ClassRosterDao dao;
    
    // Member field of type ClassRosterAuditDao
    private final ClassRosterAuditDao auditDao;
    
    public ClassRosterServiceLayerImpl(ClassRosterDao dao, ClassRosterAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }
    
    /**
     * When we implement Create Student, we must 1. Ensure the incoming student
     * ID does not already exist 2. Validate that all the fields in the incoming
     * Student object have values 3. Pass the incoming Student object to the DAO
     * so that it can persist it
     *
     */
    @Override
    public void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException {
       
        // First check to see if there is already a student
        // associated with the student's id
        // If so, we're all done here
        // Throw a ClassRosterDuplicateIdException
        if (dao.getStudent(student.getStudentId()) != null ) {
            throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student. Student Id " 
            + student.getStudentId()
            + " already exists.");
        }
        
        // Now validate all the fields on the given Student object.
        // This method will throw an 
        // exception if any of the validation rules are violated.
        validateStudentData(student);
        
        // We passed all our business rules check so go ahead
        // and persist the Student object
        dao.addStudent(student.getStudentId(), student);
        
        // The Student was successfully created, now write to the audit log 
        auditDao.writeAuditEntry("Student " + student.getStudentId() + " CREATED.");
        
    }
    
    // This is simply a pass-through method
    // We call the getAllStudents method on the DAO and return the results
    @Override
    public List<Student> getAllStudents() throws 
            ClassRosterPersistenceException {
        return dao.getAllStudents();
    }
    
    // Similar to getAllStudents()
    @Override
    public Student getStudent(String studentId) throws 
            ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }
    
    @Override
    public Student removeStudent(String studentId) throws 
            ClassRosterPersistenceException {
        Student removedStudent = dao.removeStudent(studentId);
        // Write to the audit log 
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED.");
        return removedStudent;
    }
    
    // This method enforces that all students must have a First Name, Last Name, and Cohort
    private void validateStudentData(Student student) throws 
            ClassRosterDataValidationException {
        
        if (student.getFirstName() == null
                
                // trim removes any leading or trailing whitespace
                // In Java, null and empty strings are not the same thing
                || student.getFirstName().trim().length() == 0
                || student.getLastName() == null
                || student.getLastName().trim().length() == 0
                || student.getCohort() == null
                || student.getCohort().trim().length() == 0) {
            
            throw new ClassRosterDataValidationException("ERROR: All fields [First Name, Last Name, Cohort] are required.");
        }
    }
}
