/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uniegupires
 */
public class Exercicio_01 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Food> menu = new ArrayList<>();
        
        char option = '-';
        
        while(Character.toLowerCase(option) != 'q') {
            System.out.println("\nEscolha uma opcao:");
            System.out.println("n: ADICIONAR alimento");
            System.out.println("d: REMOVER alimento");
            System.out.println("a: ATUALIZAR alimento");
            System.out.println("p: IMPRIMIR menu");
            System.out.println("s: PROCURAR alimento");
            System.out.println("q: SAIR do programa\n");
            
            option = input.next().charAt(0);
            
            switch (Character.toLowerCase(option)) {
                case 'n' -> {
                    addFood(input, menu);
                }
                case 'd' -> {
                    removeFood(input, menu);
                }
                case 'a' -> {
                    updateFood(input, menu);
                }
                case 'p' -> {
                    printMenu(menu);
                }
                case 's' -> {
                    getFood(input, menu);
                }
                case 'q' -> {
                    System.out.println("Saindo...");
                }
                default -> {
                    System.out.println("Opcao invalida!");
                }
            }
        }
    }
    
    public static Food findFood(String name, ArrayList<Food> menu) {
        Food found = null;
        
        for(Food f: menu) {
            if (f.getProduct().equals(name)) {
                found = f;
                break;
           }
        }
        
        if (found == null) System.out.println("Alimento nao encontrado!");
        
        return found;
    }
    
    public static void addFood(Scanner input, ArrayList<Food> menu) {
        System.out.println("Digite o nome do prato que deseja ADICIONAR:");
        String product = input.next();
        System.out.println("Digite o preco do prato:");
        float price = input.nextFloat();
        
        menu.add(new Food(product, price));
    }
    
    public static void removeFood(Scanner input, ArrayList<Food> menu) {
        System.out.println("Digite o nome do prato que deseja REMOVER:");
        String product = input.next();
        
        menu.removeIf(f -> f.getProduct().equals(product));
    }
    
    public static void updateFood(Scanner input, ArrayList<Food> menu) {
        System.out.println("Digite o nome do prato que deseja ATUALIZAR:");
        String product = input.next();
        Food f = findFood(product, menu);
        
        if(f == null) return;
        
        System.out.println("Digite o NOVO preco do prato:");
        float price = input.nextFloat();
        
        f.setPrice(price);
    }
    
    public static void getFood(Scanner input, ArrayList<Food> menu) {
        System.out.println("Digite o nome do prato que deseja PROCURAR:");
        String product = input.next();
        Food f = findFood(product, menu);
        
        if(f == null) return;
        
        System.out.println(f.toString());
    }
    
    public static void printMenu(ArrayList<Food> food) {
        System.out.println("========== MENU ==========");
        for(Food f : food) {
            System.out.print(f.toString());
        }
        System.out.println("==========================");
    }
}
