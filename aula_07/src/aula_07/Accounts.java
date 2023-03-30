/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_07;

import java.util.ArrayList;

/**
 *
 * @author uniegupires
 */

enum AccountType {
    SALARY,
    CHECKING,
};

public class Accounts {
    private final String cpf;
    private final String name;
    private final Date clientSince;
    private CheckingAccount checkingAcc;
    private ArrayList<SalaryAccount> salaryAccs = new ArrayList<>();
    
    public Accounts(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
        this.clientSince = new Date(30, 03, 2023);
    }
    
    public Accounts(String cpf, String name, Date since) {
        this.cpf = cpf;
        this.name = name;
        this.clientSince = since;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public String getName() {
        return this.name;
    }

    public CheckingAccount getCheckingAcc() {
        return checkingAcc;
    }

    public ArrayList<SalaryAccount> getSalaryAccs() {
        return salaryAccs;
    }
    
    public void openAccount(AccountType type) {
        switch(type) {
            case CHECKING -> {
                System.out.println("\nAbrindo Conta Corrente...");
                
                if (this.checkingAcc != null) {
                    System.out.println("Conta Corrente ja existente!\n");
                    break;
                }
                
                this.checkingAcc = new CheckingAccount(1, 100);
                
                System.out.println("Conta Corrente aberta!\n");
            }
            case SALARY -> {
                System.out.println("\nAbrindo Conta Salario...");
                
                final int accNum = this.salaryAccs.size() + 1;
                this.salaryAccs.add(new SalaryAccount(accNum, 100));
                
                System.out.println("Conta Salario aberta!\n");
            }
        }
    };

    @Override
    public String toString() {
        int ccNum = 0;
        if (checkingAcc != null) ccNum = checkingAcc.getNumber();
        return "Contas\nCPF:" + cpf + "\nNome:" + name + "\nCliente desde:" + clientSince.toString() + "\nNumero da CC:" + ccNum + "\nQuantidade de CS:" + this.salaryAccs.size();
    }
    
    
}
