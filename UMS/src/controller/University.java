/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author uniegupires
 */
public class University {    
    public void registerStudent() {}
    
    public void unregisterStudent() {}
    
    public void showAllSubjects() {}
    
    public void showSubjects(String studentRa) {}
    
    public void addSubjectToStudent(String subject, int studentId) {}
    
    public void showGrades(String studentRa) {}
    
    public void showGradesHistory(String studentRa) {}
    
    // get all
    public void showStudents(String ...subject) {
        if (!subject[0].isEmpty()) {} // search with subject
        // search all without subjects
    }
    
    // get one  
    public void showStudent(String studentRa) {}
    
    public void closeSemester() {}
}
