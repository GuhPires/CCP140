/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.StudentModel;
import model.SubjectModel;
import model.UserModel;
import model.Utils;

/**
 *
 * @author uniegupires
 */
public class University {
    private String name;
    
    public University(String name) {
        this.name = name;
    }
    
    public Student registerStudent(String fname, String lname, String password, int semester) {
        UserModel userModel = new UserModel();
        StudentModel studentModel = new StudentModel();
        
        String RA = Utils.genRA();
        
        User user = userModel.insertOne(new User(RA, password, "student"));
        
        if (user == null) return null;
        System.out.println("USER CREATED");
        
        Student student = studentModel.insertOne(new Student(fname, lname, RA, this.name, semester));
        
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
    
    public List<Subject> getAllSubjects() {
        SubjectModel model = new SubjectModel();
        
        return model.getAll(); 
    }
    
    public void getStudentSubjects(String studentRa) {}
    
    public boolean addSubjectToStudent(Subject subject, Student student) {
        SubjectModel model = new SubjectModel();
        
        return model.setStudent(subject, student);
    }
    
    public void getStudentGrades(String studentRa) {}
    
    public void getStudentHistory(String studentRa) {}
    
    public List<Student> getStudents(String ...subject) {
        StudentModel model = new StudentModel();
        
        String sub = subject.length > 0 && !subject[0].isBlank() ? subject[0] : null;
        
        if (sub != null) return model.getAllBySubject(sub);
        
        return model.getAllByUniversity(this.name);
    }
    
    // get one  
    public void showStudent(String studentRa) {
        // TODO: output curr and prev grades and subjects
    }
    
    public void closeSemester() {}

    public String getName() {
        return name;
    }
}
