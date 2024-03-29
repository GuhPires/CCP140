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
    
    public static University findUniversity(String username) {
       return new University(username);
   }
    
    public Student registerStudent(String fname, String lname, String password, int semester) {
        UserModel userModel = new UserModel();
        StudentModel studentModel = new StudentModel();
        
        String RA = Utils.genRA();
        
        User user = userModel.insertOne(new User(RA, password, "student"));
        
        if (user == null) return null;
        
        Student student = studentModel.insertOne(new Student(fname, lname, RA, this.name, semester));
        
        // TODO: delete created user
        if (student == null) return null;
        
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
        
        Subject subject = model.insertOne(new Subject(name, this.name));
        
        return subject != null;
    }
    
    public boolean addSubjectToStudent(Subject subject, Student student) {
        SubjectModel model = new SubjectModel();
        
        return model.setStudent(subject, student);
    }
    
    public List<Student> getStudents(String ...subject) {
        StudentModel model = new StudentModel();
        
        String sub = subject.length > 0 && !subject[0].isBlank() ? subject[0] : null;
        
        if (sub != null) return model.getAllBySubject(sub);
        
        return model.getAllByUniversity(this.name);
    }
    
    public List<Subject> getStudentSubjects(Student student, boolean current) {
        SubjectModel model = new SubjectModel();
        
        return model.getAllByStudent(student, current);
    }
    
    public boolean setStudentGrades(Subject subject) {
        SubjectModel model = new SubjectModel();
        
        return model.setGrades(subject);
    }
    
    public List<Subject> getAllDistinctSubjects() {
        SubjectModel model = new SubjectModel();
        
        return model.getAllDistinct(this.name); 
    }
    
    public List<Subject> getAllSubjects() {
        SubjectModel model = new SubjectModel();
        
        return model.getAllByUniversity(this.name); 
    }
    
    public boolean finishSemester() {
        StudentModel model = new StudentModel();
        
        return model.finishSemester(this.name);
    }

    public String getName() {
        return name;
    }
}
