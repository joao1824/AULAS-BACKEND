package com.lista.jogadores;
import com.lista.gerador_senhas.Gerador;

import java.util.Random;


public class jogador {


    public String nome;
    public String sobrenome;
    public String posicao;
    public String time;


    jogador() {
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

    public static void main(String[] args) {
        jogador jogador = new jogador();
    }

}
