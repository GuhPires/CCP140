/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author uniegupires
 */
public abstract class Person {
    public String user;
    public String firstName;
    public String lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;   
    }
    
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}
