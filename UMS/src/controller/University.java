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
    private ArrayList<String> subjects = new ArrayList<>();
    
    public Student registerStudent() {
        return new Student("John", "Doe");
    }
    
    public void unregisterStudent() {}
    
    public void addSubjectToStudent(String subject, String studentId) {}
    
    // get one
    public void showStudent(String student) {}
    
    // get all
    public void showStudent() {}
    
    public void showSubjects() {}   
}
