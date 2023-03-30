/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio_01;

/**
 *
 * @author uniegupires
 */
public class Exercicio_01 {
    public static void main(String[] args) {
        // criando objeto sem argumentos
        Television tv1 = new Television();
        // testando os valores iniciais do objeto 1
        System.out.println("TV1: " + tv1.toString());
        // criando objeto com canal e volume
        Television tv2 = new Television(2, 9);
        // testando os valores iniciais do objeto 2
        System.out.println("TV2: " + tv2.toString());
        // criando objeto com canal, volume e com a TV ligada
        Television tv3 = new Television(40, 2, true);
        // testando os valores iniciais do objeto 3
        System.out.println("TV3: " + tv3.toString());
        System.out.println("");
        
        //ligando a TV1
        tv1.setIsOn(true);
        // imprimindo o canal da TV1
        System.out.printf("Canal atual da TV1: %d\n", tv1.getChannel());
        // tentando modificar o canal da TV1 para um valor inválido
        tv1.setChannel(80);
        // o valor do canal da TV1 deve permanecer inalterado
        System.out.printf("Canal inalterado da TV1: %d\n", tv1.getChannel());
        // modificando o canal da TV1 para um valor válido
        tv1.setChannel(64);
        // o valor do canal da TV1 deve ter sido alterado
        System.out.printf("Canal alterado da TV1: %d\n\n", tv1.getChannel());

        // testando se é possivel alterar o canal com a TV desligada
        tv2.setChannel(10);
        System.out.printf("Canal inalterado da TV2: %d\n", tv2.getChannel());
        tv2.nextChannel();
        System.out.printf("Canal inalterado da TV2: %d\n", tv2.getChannel());
        tv2.prevChannel();
        System.out.printf("Canal inalterado da TV2: %d\n", tv2.getChannel());
        // testando se é possivel alterar o volume com a TV desligada
        tv2.increaseVolume();
        System.out.printf("Volume inalterado da TV2: %d\n", tv2.getVolume());
        tv2.decreaseVolume();
        System.out.printf("Volume inalterado da TV2: %d\n\n", tv2.getVolume());
        
        // ligando a TV2 com o toggle
        tv2.toggleOn();
        System.out.printf("TV2 esta ligada? %b\n", tv2.isOn());
        
        // imprimindo o volume da TV2
        System.out.printf("Volume atual da TV2: %d\n", tv2.getVolume());
        // aumentado o volume da TV2
        tv2.increaseVolume();
        System.out.printf("Volume alterado da TV2: %d\n", tv2.getVolume());
        // tentando aumentar o volume da TV2 após ter atingido o volume máximo
        tv2.increaseVolume();
        System.out.printf("Volume inalterado da TV2: %d\n", tv2.getVolume());
        // diminuindo o volume da TV2
        tv2.decreaseVolume();
        System.out.printf("Volume reduzido da TV2: %d\n\n", tv2.getVolume());
        
        // colocando um canal válido para a TV3
        tv3.setChannel(64);
        System.out.printf("Canal atual da TV3: %d\n", tv3.getChannel());
        // tentando aumentar o canal da TV3 após ter atingido o canal máximo
        tv3.nextChannel();
        // diminuindo o canal da TV3
        tv3.prevChannel();
        System.out.printf("Canal reduzido da TV3: %d\n\n", tv3.getChannel());
    }
}
