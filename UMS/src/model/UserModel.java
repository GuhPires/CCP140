/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import controller.Person;
import controller.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uniegupires
 */
public class UserModel extends DBModel<Person> {
    
    public UserModel() {
        super("users");
    }
}
