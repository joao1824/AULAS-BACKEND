package org.example.ex01;


public class Personagem {

    private String nome;
    private int vida;
    private int ataque;

    Personagem(){}

    Personagem(String nome, int vida, int ataque){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public int getVida(){
        return this.vida;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public void receberDano(int dano){

        if (this.vida <= 0){
            System.out.println(this.nome + "Esta Morto");
        }else {
            this.vida -= dano;
        }
        if (this.vida <= 0){
            System.out.println(this.nome + " foi Derrotado");
        }
    }

    public void atacar(Personagem inimigo){
        if(inimigo.vida <= 0){
            System.out.println("O ataque falhou");
        }else {
            inimigo.receberDano(this.ataque);
        }
    }
}
