package org.example.ex04;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Nome: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();

        System.out.println("Descrição: ");
        String descricao = input.nextLine();

        System.out.println("Tipo(Imagem 1 - Video 2 - Texto 3): ");
        int tipo = input.nextInt();
        String tipo_escolha = "";

        if (tipo == 1){
            tipo_escolha = "Imagem";
        } else if (tipo == 2){
            tipo_escolha = "Video";
        }else if (tipo == 3){
            tipo_escolha = "Texto";
        }

        Postagem postagem = new Postagem(nome, descricao, tipo_escolha);

        MyBook myBook = new MyBook();
        Fotogram fotogram = new Fotogram();
        AnyTube anyTube = new AnyTube();


        if (tipo == 1){
            myBook.compartilharImagem(postagem);
            fotogram.compartilharImagem(postagem);
            anyTube.compartilharImagem(postagem);
        } else if (tipo == 2){
            myBook.compartilharVideo(postagem);
            fotogram.compartilharVideo(postagem);
            anyTube.compartilharVideo(postagem);
        }else if (tipo == 3){
            myBook.compartilharPostagem(postagem);
            fotogram.compartilharPostagem(postagem);
            anyTube.compartilharPostagem(postagem);
        }











    }
}
