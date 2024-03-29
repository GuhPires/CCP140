/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.User;
import java.util.List;

/**
 *
 * @author uniegupires
 */
public class UserModel extends DBModel<User> {
    
    public UserModel() {
        super("users");
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User getOne(String username) {
       try {
            PreparedStatement query = this.conn.prepareStatement("SELECT * FROM " + this.table + " WHERE username = ?");
            query.setString(1, username);
            
            ResultSet results = query.executeQuery();
            
            if (!results.next()) return null;
            
            String usr = results.getString("username");
            String pass = results.getString("password");
            String type = results.getString("type");
            
            return new User(usr, pass, type);
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public User insertOne(User user) {
        try {
            PreparedStatement query = this.conn.prepareStatement("INSERT INTO " + this.table + " (username, password, type) VALUES (?, ?, ?)");
            query.setString(1, user.getUsername());
            query.setString(2, user.getPassword());
            query.setString(3, user.getType());
            
            query.execute();
            
            return this.getOne(user.getUsername());
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<User> insertMany(List<User> objs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateOne(String idField, String idValue, String field, String value) {
        try {
            PreparedStatement query = this.conn.prepareStatement("UPDATE " + this.table + " SET " + field + " = ? WHERE " + idField + " = ?");
            query.setString(1, value);
            query.setString(2, idValue);
            
            query.execute();
            
            return true;
            
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<User> updateMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteOne(String username) {
        try {
            PreparedStatement query = this.conn.prepareStatement("DELETE FROM " + this.table + " WHERE username = ?");
            query.setString(1, username);
            
            query.execute();
            
            return true;
        } catch (SQLException e) {
            System.err.println("Query error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<User> deleteMany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
