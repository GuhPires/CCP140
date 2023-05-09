/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.StudentModel;
import model.SubjectModel;
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
    
    public Student registerStudent(String fname, String lname, String password) {
        UserModel userModel = new UserModel();
        StudentModel studentModel = new StudentModel();
        
        String RA = Utils.genRA();
        
        User user = userModel.insertOne(new User(RA, password, "student"));
        
        if (user == null) return null;
        System.out.println("USER CREATED");
        
        Student student = studentModel.insertOne(new Student(fname, lname, RA));
        
        // TODO: delete created user
        if (student == null) return null;
        
        System.out.println("STUDENT CREATED!");
        
        return student;
    }
    
    public boolean unregisterStudent(String ra) {
        UserModel userModel = new UserModel();
        StudentModel studentModel = new StudentModel();
        
        boolean deletedUser = userModel.deleteOne(ra);
        
        if (!deletedUser) return false;
        
        boolean deletedStudent = studentModel.deleteOne(ra);
        
        return deletedStudent;
    }
    
    public boolean createSubject(String name) {
        SubjectModel model = new SubjectModel();
        
        Subject subject = model.insertOne(new Subject(this.name, name));
        
        return subject != null;
    }
    
    public void showAllSubjects() {}
    
    public void showSubjects(String studentRa) {}
    
    public void addSubjectToStudent(String subject, int studentId) {}
    
    public void showGrades(String studentRa) {}
    
    public void showGradesHistory(String studentRa) {}
    
    // get all
    public void showStudents(String ...subject) {
        if (!subject[0].isBlank()) {} // search with subject
        // search all without subjects
    }
    
    // get one  
    public void showStudent(String studentRa) {
        // TODO: output curr and prev grades and subjects
    }
    
    public void closeSemester() {}
}
