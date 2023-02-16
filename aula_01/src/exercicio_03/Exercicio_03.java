/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_03;

import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float total = 0;
        int counter = 0;
        
        while (true){
            System.out.println("Digite um numero:");
            float num = input.nextFloat();
            if (num == 0) break;
            
            total += num;
            counter++;
        }
        
        System.out.printf("Quantidade de numeros digitados: %d\n", counter);
        System.out.printf("Soma dos numeros digitados: %f\n", total);
        System.out.printf("Media aritimetica dos numeros digitados: %f\n", total / counter);
    }
    
}
