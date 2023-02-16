/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Exercicio_01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite a nota N1:");
            float grade1 = input.nextFloat();
            
            System.out.println("Digite a nota N2:");
            float grade2 = input.nextFloat();
            
            System.out.println("Digite a nota N3:");
            float grade3 = input.nextFloat();
            
            float avg = (grade1 + grade2 * 2 + grade3 * 3) / 6;
            
            String status = avg >= 5 ? "Aprovado" : "Reprovado";
            
            System.out.println(status);
        }
}
