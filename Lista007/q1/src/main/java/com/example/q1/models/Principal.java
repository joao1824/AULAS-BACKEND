package com.example.q1.models;
import java.util.List;

public class Principal {
    private List<Jogador> jogadores;
    private Reservas reservas;

    public Principal(List<Jogador> jogadores, List<Jogador> reservas) {
        this.jogadores = jogadores;
        this.reservas = new Reservas(reservas);
    }

    public List<Jogador> addJogador(String posicao) {
        if (jogadores.size() >= 11){
            throw new RuntimeException("Limite de jogadores");
        }
        if (reservas.getJogador(posicao) != null){
           Jogador jogador = reservas.getJogador(posicao);
           jogadores.add(jogador);
           reservas.removeJogador(posicao);
           return jogadores;
        }
        throw new RuntimeException("Posicao inexistente");

    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }


}
