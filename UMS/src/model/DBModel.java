/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.util.List;

/**
 *
 * @author uniegupires
 */
public abstract class DBModel<T> {
    protected final String table;
    protected final Connection conn;
    
    public DBModel(String table) {
        DB db = new DB();
        this.conn = db.connect();
        this.table = table;
    }
    
    public abstract List<T> getAll();
    public abstract T getOne();
    public abstract T insertOne();
    public abstract List<T> insertMany();
    public abstract T updateOne();
    public abstract List<T> updateMany();
    public abstract T deleteOne();
    public abstract List<T> deleteMany();
}
