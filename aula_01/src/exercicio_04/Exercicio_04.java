/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // holds the number of iterations
        int ITERATIONS = 100;
        
        int max = 0;
        int updated = 0;
        
        for(int i = 0; i < ITERATIONS; i++) {
            Random random = new Random();
            int num = random.nextInt();
            
            if (max >= num) continue;
            
            max = num;
            updated++;
        }
        
        System.out.printf("Maior numero gerado: %d\n", max);
        System.out.printf("O maior numero foi alterado %d vezes \n", updated);
    }
}
