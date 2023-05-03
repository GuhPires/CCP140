/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

/**
 *
 * @author uniegupires
 */
public class DVD extends Product {
    private int premieredAt;
    private double duration;

    public DVD(String name, double price, int premieredAt, double duration) {
        super(name, price);
        this.premieredAt = premieredAt;
        this.duration = duration;
    }

    public int getPremieredAt() {
        return premieredAt;
    }

    public void setPremieredAt(int premieredAt) {
        this.premieredAt = premieredAt;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return """
               ===== PRODUTO: DVD =====
               Nome: """ + name + "\n" +
               "Preco: R$ " + price + "\n" +
               "Ano de estreia: " + premieredAt +
               "\nDuracao: " + duration + "h\n" +
               "=======================\n";
    }
}
