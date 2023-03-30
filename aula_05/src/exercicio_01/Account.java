/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Account {
    private int number;
    private String name;
    private double balance;
    private double limit;
    
    public Account(int number, String name) {
        this.number = number;
        this.name = name;
        this.balance = 0;
        this.limit = 10;
    }
    
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
    
    public void setLimit(double limit) {
        // limite deve ser sempre um número positivo
        if (limit >= 0) {
            this.limit = limit;   
        } else {
            this.limit = limit * -1;
        }
    }

    public boolean debit(double amount) {
        if (amount > this.balance + this.limit) {
            System.out.println("Valor a ser debitado e maior do que o limite, operacao nao sera executada.");
            return false;
        }
        
        this.balance -= amount;
        
        return true;
    }
    
    public boolean charge(double amount) {
        this.balance += amount;
        
        return true;
    }
    
    @Override
    public String toString() {
        return "Conta no nome de: " + this.name + "\nNumero: " + this.number + "\nSaldo: " + this.balance + "\nLimite: -" + this.limit;
    }
}
