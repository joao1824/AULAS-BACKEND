package org.example;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner scanner_in = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = scanner_in.nextDouble();

        if(valor > 100){
            valor = (valor * 90) / 100;
            System.out.println("Valor final com desconto: " + valor);
        }else {
            System.out.println("Valor final sem desconto: " + valor);
        }

    }
}
