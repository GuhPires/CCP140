/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_07;

/**
 *
 * @author uniegupires
 */
public class CheckingAccount {
    private final int number;
    private double balance;
    private double limit;
    
    public CheckingAccount(int number, double balance) {
        this.number = number;
        this.balance = balance;
        this.limit = 10;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double getLimit() {
        return this.limit;
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
        if (amount * 1.02 > this.balance + this.limit) {
            System.out.println("Valor a ser debitado e maior do que o limite, operacao nao sera executada.");
            return false;
        }
        
        this.balance -= amount * 1.02;
        
        return true;
    }
    
    public boolean charge(double amount) {
        this.balance += amount;
        
        return true;
    }

    @Override
    public String toString() {
        return "Conta Corrente{" + "numero: " + number + ", saldo: R$ " + balance + ", limite: R$ " + limit + '}';
    }
}
