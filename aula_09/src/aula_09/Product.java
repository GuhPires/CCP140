/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

/**
 *
 * @author uniegupires
 */
public class Product {
    protected String name;
    protected double price;
            
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return """
               ===== PRODUTO =====
               Nome:  """ + name + "\n" +
               "Preco: R$ " + price + "\n" +
               "===================\n";
    }
}
