/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "John Doe";
        account.number = 12345;
        account.balance = 1000.00;
        account.limit = 2000.00;
        
        System.out.printf("Nome na conta: %s\n", account.name);
        System.out.printf("Numero da conta: %d\n", account.number);
        System.out.printf("Saldo: %.2f\n", account.balance);
        System.out.printf("Limite: %.2f\n", account.limit);
        
        // debita $100 da conta
        account.debit(100);
        System.out.printf("Novo saldo: %.2f\n", account.balance);
        // adiciona $150 na conta
        account.charge(150);
        System.out.printf("Novo saldo: %.2f\n", account.balance);
        // tenta debitar um valor maior do que o disponível na conta 
        account.debit(2000);
        System.out.printf("Novo saldo: %.2f\n", account.balance);
        
        // novas contas
        Account account2 = new Account();
        account2.name = "Jane Doe";
        account2.number = 12346;
        account2.balance = 600.00;
        account2.limit = 2000.00;
        
        Account account3 = new Account();
        account3.name = "Jack Doe";
        account3.number = 12347;
        account3.balance = 2000.00;
        account3.limit = 4000.00;
        
        // debitando e adicionando valores para as novas contas
        // debita $150 da conta 2
        account2.debit(150);
        System.out.printf("Novo saldo conta 2: %.2f\n", account2.balance);
        // adiciona $250 na conta 2
        account2.charge(250);
        System.out.printf("Novo saldo conta 2: %.2f\n", account2.balance);
        // debita $550 da conta 3
        account3.debit(550);
        System.out.printf("Novo saldo conta 3: %.2f\n", account3.balance);
        // adiciona $250 na conta 3
        account3.charge(250);
        System.out.printf("Novo saldo conta 3: %.2f\n", account3.balance);
    }
}

