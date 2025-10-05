package com.example.q1.models;

import java.util.List;

public class Reservas {
    private List<Jogador> jogadores;

    public Reservas(List<Jogador> jogadores) {
        this.jogadores = jogadores;
        jogadores.add(new Jogador("André", "Goleiro", 24));
        jogadores.add(new Jogador("Vinícius", "Zagueiro", 22));
        jogadores.add(new Jogador("Leonardo", "Lateral Direito", 23));
        jogadores.add(new Jogador("Fernando", "Meio-Campo", 25));
        jogadores.add(new Jogador("Mateus", "Atacante", 24));
    }

    public Jogador getJogador(String posicao) {
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicao().equals(posicao)) {
                return jogador;
            }
        }
        return null;
    }

    public void removeJogador(String posicao) {
        for (Jogador jogador : jogadores) {
            if (jogador.getPosicao().equals(posicao)) {
                jogadores.remove(jogador);
            }
        }
        return;
    }


}
