package com.lista.pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pokemons: ");
        int quantidade = input.nextInt();
        for (int i = 0; i < quantidade ; i++) {
            PokemonAleatorio pokemonAleatorio = new PokemonAleatorio();
        }

    }
}
