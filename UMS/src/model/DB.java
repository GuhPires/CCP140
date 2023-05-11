/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author uniegupires
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private Connection conn;
    
    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
            
            String url = "jdbc:postgresql://localhost:5432/ums";
            String username = "postgres";
            String password = "fei";
            
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected!");
            
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection error: " + e.getMessage());
            return null;
        }
    }
    
    public void disconnect() {
        try {
            if (this.conn != null && !conn.isClosed()) conn.close();
            System.out.println("Disconnected!");
        } catch (SQLException e) {
            System.err.println("Disconnection error: " + e.getMessage());
        }
    }
}
