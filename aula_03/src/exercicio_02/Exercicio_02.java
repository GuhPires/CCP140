/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_02;

/**
 *
 * @author uniegupires
 */
public class Exercicio_02 {
    public static void main(String[] args) {
        Product product = new Product();
        
        product.setBrand("Marca Legal");
        product.setType("Tipo Interessante");
        product.setPrice(10.00);
        product.setQtyLimit(5);
        
        // mostra as informações iniciais do produto
        product.getInfo();
        
        // adicionando produtos no estoque
        product.addQty(4);
        // retorna mensagem de erro qty > limite de qty
        product.addQty(2);
        
        // remove produtos do estoque
        product.sell(4);
        // retorna mensagem de erro qty = 0 após ultima compra
        product.sell(1);
        
        // mostra as informações finais do produto
        product.getInfo();
    }
}
