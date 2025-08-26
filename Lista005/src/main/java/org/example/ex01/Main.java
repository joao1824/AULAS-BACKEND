package org.example.ex01;
import java.util.Random;
import java.util.random.*;

public class Main {
    public static void main(String[] args) {
        Personagem verme = new Personagem("Verme da Areia",50,10);
        Personagem rato = new Personagem("Rato",10,10);
        Personagem cobra = new Personagem("Cobra",50,20);
        Personagem[] inimigos = {verme,rato,cobra};

        Personagem jogador = new Personagem("Timothée Chalamet",2000,25);

        Random radomizador = new Random();

        while (true){
            if (jogador.getVida() <= 0 || verme.getVida() <= 0 && rato.getVida() <= 0 && cobra.getVida() <= 0 ){
                break;
            }
            int alvo = radomizador.nextInt(3);
            if (inimigos[alvo].getVida() != 0 && inimigos[alvo].getVida() > 0){
                jogador.atacar(inimigos[alvo]);
                for(int x = 0; x < inimigos.length; x++){
                    inimigos[x].atacar(jogador);
                }
            }
        }




    }

}
