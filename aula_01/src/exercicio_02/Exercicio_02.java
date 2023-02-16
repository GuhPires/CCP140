/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio_02;

import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor por hora:");
        float price = input.nextFloat();
        
        System.out.println("Digite a quantidade de horas trabalhadas");
        float hours = input.nextFloat();
        
        double income = price * hours;
        double ir = income * 0.11;
        double inss = income * 0.08;
        double union = income * 0.05;
        double total = income - ir - inss - union;
        
        System.out.printf("Seu salario bruto: %f\n", income);
        System.out.printf("Valor pago para o IR: %f\n", ir);
        System.out.printf("Valor pago para o INSS: %f\n", inss);
        System.out.printf("Valor pago para o Sindicato: %f\n", union);
        System.out.printf("Seu salario liquido: %f\n", total);
    }
    
}
