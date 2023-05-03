/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

import java.util.ArrayList;

/**
 *
 * @author uniegupires
 */
public class CD extends Product {
    private ArrayList<String> tracks = new ArrayList<>();

    public CD(String name, double price) {
        super(name, price);
    }
    
    public void addTrack(String name) {
        this.tracks.add(name);
    }

    @Override
    public String toString() {
        String out = "===== PRODUTO: CD =====\n";
        
        out = out + "Nome: " + name +
                    "\nPreco: R$ " + price + "\n";
        
        if (!tracks.isEmpty()) {
            for(int i = 0; i < tracks.size(); i++){
                out = out + "Faixa " + (i + 1) + ":" + tracks.get(i) + "\n";
            }
        } else {
            out = out + "Nenhuma Faixa\n";
        }
        
        out = out + "=======================\n";
        
        return out;
    }
}
