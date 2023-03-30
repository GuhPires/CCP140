/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account accounts[] = new Account[3];
        
        accounts[0] = new Account(1, "John");
        accounts[1] = new Account(2, "Alek");
        accounts[2] = new Account(3, "Chris");
        
        // imprimindo os valores iniciais de cada conta
        for (int i = 0; i < 3; i++) {
            System.out.println("====================");
            System.out.println(accounts[i].toString());
            System.out.println("====================");
        }
        
        // modificando e acessando valores da conta 1
        System.out.println("========== CONTA 1 ==========");
        accounts[0].charge(100);
        accounts[0].setLimit(50);
        System.out.printf("Novo limite: %f\n", accounts[0].getLimit());
        
        // modficando e acessando valores da conta 2
        System.out.println("========== CONTA 2 ==========");
        accounts[1].charge(50);
        accounts[1].debit(30);
        System.out.printf("Novo saldo: %f\n", accounts[1].getBalance());
        
       // verificando o funcionamento do débito com limite
       System.out.println("========== CONTA 3 ==========");
       accounts[2].charge(100);
       // funciona pois o limite padrão é 10
       accounts[2].debit(110);
       System.out.printf("Novo saldo: %f\n", accounts[2].getBalance());
       // NÃO funciona pois o limite já foi atingido
       accounts[2].debit(1);
       // funciona após aumentar o limite
       accounts[2].setLimit(15);
       accounts[2].debit(1);
       System.out.printf("Novo saldo: %f\n", accounts[2].getBalance());
       
       // imprimindo os valores APÓS MODIFICAÇÕES de cada conta
        for (int i = 0; i < 3; i++) {
            System.out.println("====================");
            System.out.println(accounts[i].toString());
            System.out.println("====================");
        }
    }   
}
