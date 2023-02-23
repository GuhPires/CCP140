/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_02;

/**
 *
 * @author uniegupires
 */
public class PrivateAccount {
    private int number;
    private String name;
    private double balance;
    private double limit;
    
    public int getNumber() {
        return this.number;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double getLimit() {
        return this.limit;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public boolean debit(double amount) {
        if (amount > this.balance) {
            System.out.println("Valor a ser debitado e maior do que o saldo, operacao nao sera executada.");
            return false;
        }
        
        this.balance -= amount;
        
        return true;
    }
    
    public boolean charge(double amount) {
        this.balance += amount;
        
        return true;
    }
}
