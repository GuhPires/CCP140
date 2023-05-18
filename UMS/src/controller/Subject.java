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
    private int id;
    private String university;
    private String student;
    private String name;
    private int semester;
    private float grade;
    
    public Subject(String name, String university) {
        this.name = name;
        this.university = university;
    }
    
    public Subject(int id, String name, String university, String student, int semester, float grade) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.student = student;
        this.semester = semester;
        this.grade = grade;
    }
    
    
    public int getId() {
        return id;
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

    public int getSemester() {
        return semester;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name;
    }
}
