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
    
    public List<Student> getAll(String university) {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table + " WHERE university = ?");
            query.setString(1, university);
            
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
    public Student insertOne(Student student) {
        try {
            PreparedStatement query = this.conn.prepareStatement("INSERT INTO " + this.table + " (ra, first_name, last_name) VALUES (?, ?, ?)");
            query.setString(1, student.getRA());
            query.setString(2, student.firstName);
            query.setString(3, student.lastName);
            
            query.execute();
            
            return this.getOne(student.getRA());
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Student> insertMany(List<Student> objs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateOne(String idField, String idValue, String field, String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> updateMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteOne(String ra) {
        try {
            PreparedStatement query = this.conn.prepareStatement("DELETE FROM " + this.table + " WHERE ra = ?");
            query.setString(1, ra);
            
            query.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Student> deleteMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
