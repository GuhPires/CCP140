/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ums;

import controller.Student;
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
        StudentModel student = new StudentModel();
        
        List<Student> students = student.getAll();
        System.out.println(students);
        
        for (Student s : students) {
            System.out.println("Student:" + s.toString());
        }
    }
    
}
