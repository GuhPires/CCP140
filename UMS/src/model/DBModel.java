/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author uniegupires
 */
public abstract class DBModel {
    protected final String table;
    protected final Connection conn;
    
    public DBModel(String table) {
        DB db = new DB();
        this.conn = db.connect();
        this.table = table;
    }
    
    public abstract ResultSet getAll();
    public abstract ResultSet getOne();
    public abstract ResultSet insertOne();
    public abstract ResultSet insertMany();
    public abstract ResultSet updateOne();
    public abstract ResultSet updateMany();
    public abstract ResultSet deleteOne();
    public abstract ResultSet deleteMany();
}
