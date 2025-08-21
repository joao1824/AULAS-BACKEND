package org.example;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner_in = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        int idade = scanner_in.nextInt();

        String categoria;
        if (idade < 12){
           System.out.println("Categoria: Infantil");
        }else if (idade >= 12 && idade <= 17){
           System.out.println("Categoria: Adolescente");
        }else{
           System.out.println("Categoria: Adulto");
        }

    }
}
