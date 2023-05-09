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
    
    public static String genRA() {
        final int MAX = 999;
        final int MIN = 100;
        final int control = Utils.random(MAX, MIN);
        final int digit = Utils.random(0, 9);
        return "11.123." + control + "-" + digit;
    }
}
