/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package index;

import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha o exercicio a ser executado (1 a 4):");
        int exe = input.nextInt();
        
        switch(exe) {
            case 1:
                printExe(exe);
                break;
            case 2:
                printExe(exe);
                break;
            case 3:
                printExe(exe);
                break;
            case 4:
                printExe(exe);
                break;
            default:
                System.out.println("Escolha invalida. Por favor escolha um numero entre 1 e 4");
                break;
        }
    }
    
    private static void printExe(int num) {
        System.out.printf("==== EXECUTANDO EXERCICIO %d ====\n", num);
    }
    
}
