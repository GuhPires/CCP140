/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_07;

/**
 *
 * @author uniegupires
 */
public class Aula_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Accounts accounts = new Accounts("123.456.789-01", "Alex");
        
        // conta deve iniciar zerada
        System.out.println(accounts.toString());
        
        // adicionando conta corrente
        accounts.openAccount(AccountType.CHECKING);
        System.out.println(accounts.toString());
        
        // não deve permitir a abertura de outra conta corrente
        accounts.openAccount(AccountType.CHECKING);
        
        // deve abrir uma conta salário
        accounts.openAccount(AccountType.SALARY);
        System.out.println(accounts.toString());
        
        // deve permitir abrir outra conta salário
        accounts.openAccount(AccountType.SALARY);
        System.out.println(accounts.toString());
        
        // debitando 90 reais da CC (deve descontar os 2%)
        CheckingAccount cc = accounts.getCheckingAcc();
        cc.debit(90);
        System.out.println(cc.toString() + "\n");
        
        // deve permitir debitar 10 reais da CC e usar o limite
        cc.debit(10);
        System.out.println(cc.toString() + "\n");
        
        // debita 95 reais da CS 1
        SalaryAccount cs1 = accounts.getSalaryAccs().get(0);
        cs1.debit(95);
        System.out.println(cs1.toString() + "\n");
        
        // não permite debitar 10 reais da CS 1
        cs1.debit(10);
        System.out.println(cs1.toString() + "\n");
        
        // verificando todas as operações efetuadas
        System.out.println(accounts.toString());
    }
    
}
