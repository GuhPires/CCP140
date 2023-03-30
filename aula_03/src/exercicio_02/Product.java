/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_02;

/**
 *
 * @author uniegupires
 */
public class Product {
    private String brand;
    private String type;
    private double price;
    private int qty;
    private int qtyLimit;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public int getQtyLimit() {
        return qtyLimit;
    }

    public void setQtyLimit(int qtyLimit) {
        this.qtyLimit = qtyLimit;
    }
    
    public void sell(int qty) {
        if (qty > this.qty) {
            System.out.println("Nao existem quantidade suficiente desse produto no estoque!");
            return;
        }
        
        this.qty -= qty;
    }
    
    public void addQty(int qty) {
        int finalQty = qty + this.qty;
        if (finalQty > this.qtyLimit) {
            System.out.println("Limite para esse produto foi atingido, diminua a quantidade em estoque ou diminua a quantidade de produtos adicionados!");
            return;
        }
        
        this.qty = finalQty;
    }
    
    public void getInfo() {
        System.out.println("=== INFORMACOES DO PRODUTO ====");
        System.out.printf("Marca do produto: %s\n", this.brand);
        System.out.printf("Tipo do produto: %s\n", this.type);
        System.out.printf("Preco do produto: %f\n", this.price);
        System.out.printf("Quantidade em estoque: %d\n", this.qty);
        System.out.printf("Limite de estoque: %d\n", this.qtyLimit);
    }
}
