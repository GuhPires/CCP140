/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.StudentModel;
import model.SubjectModel;

/**
 *
 * @author uniegupires
 */
public class Student extends Person {
    private ArrayList<String> subjects = new ArrayList<>();
    private String RA;
    private String university;
    private int semester;
   
   public Student(String firstName, String lastName, String RA, String university, int semester) {
       super(firstName, lastName);
       this.RA = RA;
       this.university = university;
       this.semester = semester;
   }
   
   public static Student findStudent(String RA) {
       StudentModel model = new StudentModel();
       
       Student student = model.getOne(RA);
       
       return student;
   }
   
    public List<Subject> getStudentSubjects(boolean current) {
        SubjectModel model = new SubjectModel();
        
        return model.getAllByStudent(this, current);
    }

    public String getRA() {
        return RA;
    }
    
    public String getUniversity() {
        return university;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return this.getName() + " - " + RA;
    }
}
