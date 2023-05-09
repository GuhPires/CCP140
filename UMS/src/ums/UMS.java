/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ums;

import controller.Student;
import controller.University;
import java.util.List;
import model.StudentModel;

/**
 *
 * @author uniegupires
 */
public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        University uni = new University("FEI");
        
        UMS.printStudents();
        
        Student student = uni.registerStudent("Jenny", "Doe", "2222", "1234");
        
        if (student == null) {
            System.out.println("ERROR!");
            return;
        }
        
        UMS.printStudents();
    }
    
    public static void printStudents() {
        StudentModel student = new StudentModel();
        
        List<Student> students = student.getAll();
        System.out.println(students);
        
        for (Student s : students) {
            System.out.println("Student:" + s.toString());
        }
    }
    
}
