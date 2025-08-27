package org.example.ex03INCOMPLETA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        //E1


        Scanner scanner = new Scanner(System.in);
        String nome_in = scanner.nextLine();

        //E2
        PlayList playList = new PlayList(nome_in);
        Musica beliver = new Musica("Beliver", "ImagineDragons");
        Musica thunder = new Musica("Thunder", "ImagineDragons");
        Musica nature = new Musica("Nature", "ImagineDragons");
        MusicCloud musicas = new MusicCloud();

        musicas.adicionarMusica(beliver);
        musicas.adicionarMusica(thunder);
        musicas.adicionarMusica(nature);

        String musica_in = scanner.nextLine();

        if (musicas.MusicaDisponivel(musica_in)){
            playList.adicionarMusica();
            System.out.println("Você adicionou a música " + musica_in + " na playlist.");
        }


    }
}