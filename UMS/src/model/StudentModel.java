/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uniegupires
 */
public class StudentModel extends DBModel<Student> {
    
    public StudentModel() {
        super("students");
    }
    
    @Override
    public List<Student> getAll() {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table);
            
            ResultSet results = query.executeQuery();
            
            List<Student> students = new ArrayList();
            
            while(results.next()) {
                String fname = results.getString("first_name");
                String lname = results.getString("last_name");
                String ra = results.getString("ra");
                
                students.add(new Student(fname, lname, ra));
            }
            
            return students;
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Student getOne(String RA) {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table + " WHERE ra = ?");
            query.setString(1, RA);
            
            ResultSet results = query.executeQuery();
            
            if (!results.next()) return null;
            
            String fname = results.getString("first_name");
            String lname = results.getString("last_name");
            String ra = results.getString("ra");
            
            return new Student(fname, lname, ra);
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Student insertOne(Student obj) {
//        final int MAX = 999;
//        final int MIN = 100;
//        final int control = Utils.random(MAX, MIN);
//        final int digit = Utils.random(0, 9);
//        this.RA = "11.123." + control + "-" + digit;
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> insertMany(List<Student> objs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student updateOne(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> updateMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student deleteOne(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> deleteMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
