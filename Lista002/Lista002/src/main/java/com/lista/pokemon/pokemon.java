package com.lista.pokemon;
import java.util.Scanner;

import java.util.Random;

public class pokemon {

    String nome;
    String tipo;
    int nivel;
    String[] pokemons = {"Charmander", "Squirtle", "Bulbasaur", "Pikachu"};
    String[] tipos = {"Fogo", "Água", "Planta", "Elétrico"};

    pokemon() {
        Random random = new Random();
        this.nome = pokemons[random.nextInt(4)];
        this.tipo = tipos[random.nextInt(4)];
        this.nivel = random.nextInt(101);
        System.out.println(this.nome + " é um pokemon do tipo " + this.tipo + " e nivel " + this.nivel);
    }

    public void getInfo() {
        System.out.println(this.nome + " é um pokemon do tipo " + this.tipo + " e nivel " + this.nivel);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de pokemons: ");
        int quantidade = input.nextInt();
        for (int i = 0; i < quantidade ; i++) {
            pokemon pokemon = new pokemon();
        }

    }
}
