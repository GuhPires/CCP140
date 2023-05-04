/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author uniegupires
 */
public class Utils {
    public static int random(int max, int min){
        return (int)Math.floor(Math.random() *(max - min + 1) + min);
    }
}
