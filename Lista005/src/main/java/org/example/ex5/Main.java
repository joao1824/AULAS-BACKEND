package org.example.ex5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cinema cinema = new Cinema();
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Batman", 22.0, 14));
        cinema.adicionarFilme(new Filme("Vingadores", 25.0, 10));
        cinema.adicionarFilme(new Filme("Deadpool", 30.0, 18));
        cinema.adicionarFilme(new Filme("SuperMan", 18.0, 0));


        while (true) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = sc.nextLine();

                Filme filme = cinema.buscarFilme(nomeFilme);

                System.out.println("Qual assento você deseja?");
                String assento = sc.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = sc.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(sc.nextLine());

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                cinema.venderIngresso(cliente, filme, assento);

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.println("Deseja comprar outro ingresso? (s/n)");
            String opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }
}
