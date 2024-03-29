/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.UserModel;

/**
 *
 * @author uniegupires
 */
public class User {
    private String username;
    private String password;
    private String type;
   
    public User(String username, String password, String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }
    
    public static User login(String username, String password) {
        UserModel model = new UserModel();
        
        User user = model.getOne(username);
        
        if (user == null || !user.getPassword().equals(password)) return null;
        
        return user;
    }
    
    public static boolean changePass(String username, String currPass, String newPass, String passConfirmation) {
        UserModel model = new UserModel();
        
        User user = model.getOne(username);
        
        // TODO: show message to user
        if (user == null || !user.getPassword().equals(currPass)) return false;
        
        if (newPass.equals(passConfirmation)) {
            boolean updated = model.updateOne("username", username, "password", newPass);
            
            return updated;
        }
        
        return false;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }
}
