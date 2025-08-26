package com.lista.jogadores;

import java.util.Random;


public class JogadorAleatorio {


    private String nome;
    private String sobrenome;
    private String posicao;
    private String time;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    JogadorAleatorio() {
        Random randomizador = new Random();
        String[] nomes = {"Neymar", "Lionel", "Cristiano", "Casemiro"};
        String[] sobrenomes = {"Junior", "Messi", "Ronaldo", "Silva"};
        String[] posicoes = {"Atacante", "Meia", "Centroavante", "Volante"};
        String[] times = {"Al-Hilal", "Inter Miami", "Al-Nassr", "Manchester United"};

        this.nome = nomes[randomizador.nextInt(4)];
        this.sobrenome = sobrenomes[randomizador.nextInt(4)];
        this.posicao = posicoes[randomizador.nextInt(4)];
        this.time = times[randomizador.nextInt(4)];

        System.out.println(this.nome + " " + this.sobrenome + " é um jogador futebolistico que joga na posição " + this.posicao + " no time " + this.time);
    }



}
