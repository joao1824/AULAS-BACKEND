package com.lista.gerador_senhas;


import java.util.Random;

public class Gerador {

    private String senha = "";

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Gerador(){
    }

    public void Gerar(){
        Random aleatorizador = new Random();
        char caracter;
        int n = 0;
        int l = 0;
        int n_l;
        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for(int i = 0; i < 8; i++) {
            n_l = aleatorizador.nextInt(2);

            if (n > 7){ //para caso só gerar numeros ou só letras
                this.senha = this.senha + alfabeto[aleatorizador.nextInt(26)];
            } else if (l > 7) {
                this.senha = this.senha + aleatorizador.nextInt(10);
                n++;
            }

            if(n_l == 0){
                this.senha = this.senha + aleatorizador.nextInt(10);
                n++;
            }else if(n_l == 1){
                this.senha = this.senha + alfabeto[aleatorizador.nextInt(26)];
                l++;
            }

        }

        System.out.println("Senha Gerada: "+this.senha);
    }

}


