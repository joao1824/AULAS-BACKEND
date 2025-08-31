package org.example.ex03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //E1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome da playlist :");
        String nome_in = scanner.nextLine();
        scanner.nextLine();
        //E2
        PlayList playList = new PlayList(nome_in);
        Musica beliver = new Musica("Beliver", "ImagineDragons");
        Musica thunder = new Musica("Thunder", "ImagineDragons");
        Musica nature = new Musica("Nature", "ImagineDragons");
        MusicCloud musicas = new MusicCloud();

        musicas.adicionarMusica(beliver);
        musicas.adicionarMusica(thunder);
        musicas.adicionarMusica(nature);

        while (true) {
            System.out.println("Nome da musica :");
            String musica_in = scanner.nextLine();

            if (musicas.musicaSelecionada(musica_in) != -1){
                playList.adicionarMusica(musicas.getMusica(musicas.musicaSelecionada(musica_in)));
                System.out.println("Você adicionou a música " + musica_in + " na playlist.");
            }else {
                System.out.println("A música " + musica_in + " não foi encontrada no sistema.");
            }

            System.out.println("Deseja Parar? (S/N)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("S")) {
                break;
            }

        }




    }
}