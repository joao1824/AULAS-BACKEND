package org.example.ex03INCOMPLETA;
import java.util.ArrayList;

public class PlayList {
    private String nome;
    private ArrayList<Musica> musicas;

    PlayList(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void mostrarMusicas() {
        System.out.println("PlayList");
        for (Musica musica : musicas) {
            System.out.println("- "+musica.toString());
        }
    }

    public void adicionarMusica(Musica  musica) {
        this.musicas.add(musica);
    }

}
