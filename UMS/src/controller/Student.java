/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.StudentModel;

/**
 *
 * @author uniegupires
 */
public class Student extends Person {
    private ArrayList<String> subjects = new ArrayList<>();
    private String RA;
    
   public Student(String firstName, String lastName, String RA) {
       super(firstName, lastName);
       this.RA = RA;
   }
   
   public static Student findStudent(String RA) {
       StudentModel model = new StudentModel();
       
       Student student = model.getOne(RA);
       
       return student;
   }
   
    public void showGrades() {}
    
    public void showGradesHistory() {}
    
    public void changePassword() {
        // username = RA -> call updatePass method with usedId or userName
    }
}
