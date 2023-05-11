/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ums;

import controller.Student;
import controller.Subject;
import controller.University;
import java.util.List;
import model.StudentModel;
import model.SubjectModel;

/**
 *
 * @author uniegupires
 */
public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        University uni = new University("fei");
        
        List<Student> uniStudents = uni.getStudents();
        
        for (Student s : uniStudents) {
            System.out.println("Student:" + s.toString());
        }
        
        List<Student> subStudents = uni.getStudents("CCP140");
        
        for (Student s : subStudents) {
            System.out.println("Student:" + s.toString());
        }
    }
    
    public static void printStudents() {
        StudentModel student = new StudentModel();
        
        List<Student> students = student.getAll();
        
        for (Student s : students) {
            System.out.println("Student:" + s.toString());
        }
    }
    
    public static void printUniversityStudents(String university) {
        StudentModel student = new StudentModel();
        
        List<Student> students = student.getAllByUniversity(university);
        
        for (Student s : students) {
            System.out.println("Student from " + university + ":" + s.toString());
        }
    }
    
    public static void printSubjects() {
        SubjectModel model = new SubjectModel();
        
        List<Subject> subjects = model.getAll();
        
        for (Subject s : subjects) {
            System.out.println("Subject: " + s.toString());
        }
    }
    
}
