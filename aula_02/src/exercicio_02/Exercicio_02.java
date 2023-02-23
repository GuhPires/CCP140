/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_02;

/**
 *
 * @author uniegupires
 */
public class Exercicio_02 {
    public static void main(String[] args) {
        PrivateAccount account = new PrivateAccount();
        account.setName("John Doe");
        account.setNumber(12345);
        account.setLimit(2000.00);
        
        System.out.printf("Nome na conta: %s\n", account.getName());
        System.out.printf("Numero da conta: %d\n", account.getNumber());
        System.out.printf("Saldo: %.2f\n", account.getBalance());
        System.out.printf("Limite: %.2f\n", account.getLimit());
        
        // carrega $100 na conta
        account.charge(100);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        // carrega $120 na conta
        account.charge(120);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        // debita $20 da conta
        account.debit(20);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        // tenta debitar $1000 da conta
        account.debit(1000);
        System.out.printf("Novo saldo: %.2f\n", account.getBalance());
        
    }
}
