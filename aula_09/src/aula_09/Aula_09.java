/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_09;

/**
 *
 * @author uniegupires
 */
public class Aula_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product("Laranja", 10);
        Product p2 = new Product("Banana", 5.3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        // modificando nome e preço
        p1.setPrice(13.22);
        p2.setName("Uva");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        Book b1 = new Book("Senhor dos Aneis", 140, new Date(5, 10, 84), "J. R. R. Tolkien");
        Book b2 = new Book("Harry Potter", 120, new Date(05, 10, 84), "J. K. Rowling");
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        // modificando o ano e data de publicação
        b1.setPubDate(new Date(23, 7, 92));  
        b2.getPubDate().setYear(75);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        
        // imprimindo o mês de publicação de um dos livros
        System.out.printf("\nMes de publicacao do Livro %s: %d\n\n", b1.getName(), b1.getPubDate().getMonth());
        
        CD c1 = new CD("Sons para dormir", 76);
        CD c2 = new CD("Sons para acordar", 85);
        CD c3 = new CD("Sons para NAO ouvir", 100);
        c1.addTrack("Cachoeiras");
        c1.addTrack("Floresta");
        c2.addTrack("Alarme de Bombeiro");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        
        DVD d1 = new DVD("Rei Leao", 45, 1994, 1.22);
        DVD d2 = new DVD("Tropa de Elite", 65, 2007, 1.55);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
    
}
