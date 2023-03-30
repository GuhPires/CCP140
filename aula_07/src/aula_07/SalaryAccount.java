/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_07;

/**
 *
 * @author uniegupires
 */
public class SalaryAccount {
    private final int number;
    private double balance;
    
    public SalaryAccount(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }
    
    public int getNumber() {
        return this.number;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public boolean debit(double amount) {
        if (amount > this.balance) {
            System.out.println("Valor a ser debitado e maior do que o disponivel, operacao nao sera executada.");
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
        return "Conta Salario:{" + "numero: " + number + ", saldo: R$ " + balance + '}';
    }
}
