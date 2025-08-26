package org.example.ex01;
import java.util.Random;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Personagem verme = new Personagem("Verme da Areia",50,25);
        Personagem rato = new Personagem("Rato",10,25);
        Personagem cobra = new Personagem("Cobra",50,25);
        Personagem[] inimigos = {verme,rato,cobra};

        Personagem jogador = new Personagem("Timothée Chalamet",200,25);

        Random radomizador = new Random();

        while (jogador.getVida() > 0 && (verme.getVida() > 0 || rato.getVida() > 0 || cobra.getVida() > 0)) {
            int alvo = radomizador.nextInt(3);
            if (inimigos[alvo].getVida() <= 0) {
                continue;
            }else{
                jogador.atacar(inimigos[alvo]);
                for (int i = 0; i < inimigos.length; i++) {
                    if (jogador.getVida() <= 0) {
                        break;
                    }else if  (inimigos[i].getVida() > 0) {
                        inimigos[i].atacar(jogador);
                    }
                }
            }

        }

    }

}
