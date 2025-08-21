package org.example;

public class Exercicio06 {
    public static void main(String[] args){
        double[] notas = {7, 8, 6, 9, 10};
        double soma_notas = 0;
        System.out.print("Notas: ");
        for(int x = 0;notas.length > x;x++){
            System.out.print(notas[x] + " ");
            soma_notas = soma_notas + notas[x];
        }
        System.out.println("");
        System.out.println("Média: " + (soma_notas/notas.length));
    }
}
