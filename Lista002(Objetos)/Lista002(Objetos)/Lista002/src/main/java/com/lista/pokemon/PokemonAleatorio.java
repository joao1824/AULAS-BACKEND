package com.lista.pokemon;

import java.util.Random;

public class PokemonAleatorio {

    String nome;
    String tipo;
    int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    PokemonAleatorio() {
        String[] pokemons = {"Charmander", "Squirtle", "Bulbasaur", "Pikachu"};
        String[] tipos = {"Fogo", "Água", "Planta", "Elétrico"};
        Random random = new Random();
        this.nome = pokemons[random.nextInt(4)];
        this.tipo = tipos[random.nextInt(4)];
        this.nivel = random.nextInt(101);
        System.out.println(this.nome + " é um pokemon do tipo " + this.tipo + " e nivel " + this.nivel);
    }

    public void getInfo() {
        System.out.println(this.nome + " é um pokemon do tipo " + this.tipo + " e nivel " + this.nivel);
    }


}
