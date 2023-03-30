/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package index;

import exercicio_01.Exercicio_01;
import exercicio_02.Exercicio_02;
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
        
        System.out.println("Escolha o exercicio a ser executado (1 a 2):");
        int exe = input.nextInt();
        
        switch(exe) {
            case 1:
                printExe(exe);
                Exercicio_01.main(null);
                break;
            case 2:
                printExe(exe);
                Exercicio_02.main(null);
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
