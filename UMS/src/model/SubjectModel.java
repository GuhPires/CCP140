/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.Student;
import controller.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uniegupires
 */
public class SubjectModel extends DBModel<Subject> {
    
    public SubjectModel() {
        super("subjects");
    }

    @Override
    public List<Subject> getAll() {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table);
            
            ResultSet results = query.executeQuery();
            
            List<Subject> subjects = new ArrayList();
            
            while(results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                String university = results.getString("university");
                String student = results.getString("student");
                int semester = results.getInt("semester");
                float grade = results.getFloat("grade");
                
                subjects.add(new Subject(id, name, university, student, semester, grade));
            }
            
            return subjects;
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }
    
    public List<Subject> getAllByUniversity(String university) {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table + " WHERE university = ?");
            query.setString(1, university);
            
            ResultSet results = query.executeQuery();
            
            List<Subject> subjects = new ArrayList();
            
            while(results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                String uni = results.getString("university");
                String student = results.getString("student");
                int semester = results.getInt("semester");
                float grade = results.getFloat("grade");
                
                subjects.add(new Subject(id, name, uni, student, semester, grade));
            }
            
            return subjects;
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }
    
    public List<Subject> getAllByStudent(Student student, boolean current) {
        String clause = "SELECT * FROM " + this.table + " WHERE student = ?";
        
        if (current) clause += " AND semester = ?";
        
        System.out.println(clause);
        
        try {
            PreparedStatement query = this.conn.prepareStatement(clause);
            query.setString(1, student.getRA());
            
            if (current) query.setInt(2, student.getSemester());
            
            ResultSet results = query.executeQuery();
            
            List<Subject> subjects = new ArrayList();
            
            while(results.next()) {
                int id = results.getInt("id");
                String name = results.getString("name");
                String university = results.getString("university");
                String stu = results.getString("student");
                int semester = results.getInt("semester");
                float grade = results.getFloat("grade");
                
                subjects.add(new Subject(id, name, university, stu, semester, grade));
            }
            
            return subjects;
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Subject getOne(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public Subject getOne(int id) {
        try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table + " WHERE id = ?");
            query.setInt(1, id);
            
            ResultSet results = query.executeQuery();
            
            if (!results.next()) return null;
            
            String name = results.getString("name");
            String university = results.getString("university");
            String student = results.getString("student");
            int semester = results.getInt("semester");
            float grade = results.getFloat("grade");
            
            return new Subject(id, name, university, student, semester, grade);
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Subject insertOne(Subject subject) {
        try {
            PreparedStatement query = this.conn.prepareStatement("INSERT INTO " + this.table + " (name, university) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            query.setString(1, subject.getName());
            query.setString(2, subject.getUniversity());
            
            int result = query.executeUpdate();
            
            if (result == 0) return null;
            
            ResultSet created = query.getGeneratedKeys();
            
            if (!created.next()) return null;
            
            int id = created.getInt(1);
            
            return this.getOne(id);
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Subject> insertMany(List<Subject> objs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateOne(String idField, String idValue, String field, String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public boolean setStudent(Subject subject, Student student) {
        try {
            PreparedStatement query = this.conn.prepareStatement("UPDATE " + this.table + " SET student = ?, semester = ? WHERE id = ?");
            query.setString(1, student.getRA());
            query.setInt(2, student.getSemester());
            query.setInt(3, subject.getId());
            
            query.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Subject> updateMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteOne(String field) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Subject> deleteMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
