/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.StudentModel;
import model.UserModel;
import model.Utils;

/**
 *
 * @author uniegupires
 */
public class University {
    String name;
    
    public University(String name) {
        this.name = name;
    }
    
    public Student registerStudent(String fname, String lname, String ra, String password) {
        UserModel userModel = new UserModel();
        StudentModel studentModel = new StudentModel();
        
        String RA = Utils.genRA();
        
        User user = userModel.insertOne(new User(RA, password, "student"));
        
        // TODO: show message to user
        if (user == null) return null;
        System.out.println("USER CREATED");
        
        Student student = studentModel.insertOne(new Student(fname, lname, RA));
        
        // TODO: show message to user
        // TODO: delete created user
        if (student == null) return null;
        
        System.out.println("STUDENT CREATED!");
        
        return student;
    }
    
    public void unregisterStudent(String ra) {
        
    }
    
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
