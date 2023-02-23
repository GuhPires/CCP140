/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_02;

/**
 *
 * @author uniegupires
 */
public class Main {
    public static void main(String[] args) {
        PrivateAccount account = new PrivateAccount();
        account.setName("John Doe");
        account.setNumber(12345);
        account.setBalance(1000.00);
        account.setLimit(2000.00);
        
        System.out.printf("Nome na conta: %s\n", account.getName());
        System.out.printf("Numero da conta: %d\n", account.getNumber());
        System.out.printf("Saldo: %.2f\n", account.getBalance());
        System.out.printf("Limite: %.2f\n", account.getLimit());
        
        // debita $100 da conta
        account.debit(100);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        // adiciona $150 na conta
        account.charge(150);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        // tenta debitar um valor maior do que o disponível na conta 
        account.debit(2000);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        
        // novas contas
        PrivateAccount account2 = new PrivateAccount();
        account2.setName("Jane Doe");
        account2.setNumber(12346);
        account2.setBalance(600.00);
        account2.setLimit(2000.00);
        
        PrivateAccount account3 = new PrivateAccount();
        account3.setName("Jack Doe");
        account3.setNumber(12347);
        account3.setBalance(2000.00);
        account3.setLimit(4000.00);
        
        // debitando e adicionando valores para as novas contas
        // debita $150 da conta 2
        account2.debit(150);
        System.out.printf("Novo saldo conta 2: %.2f\n", account2.getBalance());
        // adiciona $250 na conta 2
        account2.charge(250);
        System.out.printf("Novo saldo conta 2: %.2f\n", account2.getBalance());
        // debita $550 da conta 3
        account3.debit(550);
        System.out.printf("Novo saldo conta 3: %.2f\n", account3.getBalance());
        // adiciona $250 na conta 3
        account3.charge(250);
        System.out.printf("Novo saldo conta 3: %.2f\n", account3.getBalance());
    }
}
