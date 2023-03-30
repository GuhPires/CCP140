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
        
        int numOfStudents = 3;
        Student[] students = new Student[numOfStudents];
        
        for (int i = 0; i < numOfStudents; i++){
            System.out.println("==== ADICIONANDO ALUNO ====:");
            students[i] = new Student();
            System.out.println("Digite o nome do aluno:");
            students[i].setName(input.next());
            System.out.println("Digite o RA do aluno:");
            students[i].setRa(input.next());
            System.out.println("Digite o curso do aluno:");
            students[i].setCourse(input.next());
            System.out.println("Digite a NOTA 1 do aluno:");
            double g1 = input.nextDouble();
            System.out.println("Digite a NOTA 2 do aluno:");
            double g2 = input.nextDouble();
            
            students[i].calcGrade(g1, g2);
            students[i].getInfo();
        }
    }
}
