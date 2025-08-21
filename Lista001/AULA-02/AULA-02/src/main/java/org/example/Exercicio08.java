package org.example;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner scanner_in = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner_in.nextLine();
        String nome_sem_espaco = nome.replaceAll("\\s+", "");;

        System.out.println("Número de caracteres: " + nome_sem_espaco.length());

        System.out.println("Maiúsculas: " + nome.toUpperCase());

        if (nome.contains("Silva") != true){
            System.out.println("Palavra 'Silva': false");
        }else{
            System.out.println("Palavra 'Silva': True");
        }



    }
}
