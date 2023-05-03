/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author uniegupires
 */
public class Student extends Person {
    private ArrayList<String> subjects = new ArrayList<>();
    private String RA;
    
   public Student(String firstName, String lastName) {
       super(firstName, lastName);
       final int MAX = 999;
       final int MIN = 100;
       final int control = Utils.random(MAX, MIN);
       final int digit = Utils.random(0, 9);
       
       this.RA = "11.123." + control + "-" + digit;
   }
    
    public void addSubjects(String subject) {
        
    }
}
