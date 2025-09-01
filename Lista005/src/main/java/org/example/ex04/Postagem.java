package org.example.ex04;

public class Postagem {
    private String titulo, descricao, string;

    Postagem(String titulo, String descricao, String string) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.string = string;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
