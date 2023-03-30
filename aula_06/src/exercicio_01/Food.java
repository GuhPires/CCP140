/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Food {
    private String product;
    private float price;
    
    public Food(String product, float price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return this.product + ": R$ " + this.price + "\n";
    }
}


