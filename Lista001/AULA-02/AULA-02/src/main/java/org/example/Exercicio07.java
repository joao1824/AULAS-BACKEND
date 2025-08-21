package org.example;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner_in = new Scanner(System.in);
        System.out.println("Altura: ");
        double altura = scanner_in.nextDouble();
        System.out.println("Peso: ");
        double peso = scanner_in.nextDouble();
        System.out.print("Seu Imc é " + (peso / (Math.pow(altura, 2))));
    }
}
