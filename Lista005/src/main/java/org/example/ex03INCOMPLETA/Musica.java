package org.example.ex03INCOMPLETA;

public class Musica {
    private String titulo;
    private String artistas;

    Musica(String titulo, String artistas) {
        this.titulo = titulo;
        this.artistas = artistas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }
}
