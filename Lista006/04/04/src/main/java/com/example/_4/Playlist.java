package com.example._4;
import java.util.ArrayList;
import java.util.List;



public class Playlist {
    String id;
    String nome;
    ArrayList<Musica> musicas = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setMusicas(Musica musica) {
        this.musicas.add(musica);
    }
}
