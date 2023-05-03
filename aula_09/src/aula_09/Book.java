/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

/**
 *
 * @author uniegupires
 */
public class Book extends Product {
    private Date pubDate;
    private String author;

    public Book(String name, double price, Date pubDate, String author) {
        super(name, price);
        this.pubDate = pubDate;
        this.author = author;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return """
               ===== PRODUTO: LIVRO =====
               Nome: """ + name + "\n" +
               "Preco: R$ " + price + "\n" +
               "Ano de publicacao:" + pubDate +
               "\nAutor: " + author + "\n" +
               "==========================\n";
    }
}
