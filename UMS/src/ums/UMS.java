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
        StudentModel studentModel = new StudentModel();
        SubjectModel subjectModel = new SubjectModel();
        
        University uni = new University("fei");
        Student student = studentModel.getOne("11.123.882-2");
        Subject subject = subjectModel.getOne(11);
        
        boolean added = uni.addSubjectToStudent(subject, student);
        
        System.out.println("ADDED? " + added);
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
        
        List<Student> students = student.getAll(university);
        
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
