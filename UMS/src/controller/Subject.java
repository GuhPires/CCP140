/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author uniegupires
 */
public class Subject {
    private String university;
    private String student;
    private String name;
    
    public Subject(String university, String name) {
        this.university = university;
        this.name = name;
    }
    
    public Subject(String university, String student, String name) {
        this.university = university;
        this.student = student;
        this.name = name;
    }
    

    public String getUniversity() {
        return university;
    }

    public String getStudent() {
        return student;
    }
    
    public String getName() {
        return name;
    }
}
