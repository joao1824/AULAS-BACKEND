package com.example.q1.models;
import java.util.List;

public class Principal {
    private List<Jogador> jogadores;
    private Reservas reservas;

    public Principal(List<Jogador> jogadores, List<Jogador> reservas) {
        this.jogadores = jogadores;
        this.reservas = new Reservas(reservas);
    }

    public List<Jogador> mudarJogador(String posicao) {



        Jogador jogador_antigo = null;
        Jogador jogador_novo = null;

        jogador_novo = reservas.getJogador(posicao);

        for (Jogador jogador : jogadores) {
            if (jogador.getPosicao().equals(posicao)) {
                    jogador_antigo = jogador;
            }
        }

        jogadores.add(jogador_novo);
        reservas.removeJogador(posicao);
        jogadores.remove(jogador_antigo);
        reservas.addJogador(jogador_antigo);

        return jogadores;

    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }


}
