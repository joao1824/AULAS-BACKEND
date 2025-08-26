package org.example.ex02;

public class Barco {
    private String nome;
    private int tamanho;

    public Barco(int tamanho, String nome) {
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
