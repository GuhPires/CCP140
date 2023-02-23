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
    public int number;
    public String name;
    public double balance;
    public double limit;
    
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
