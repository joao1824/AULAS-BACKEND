package org.example.ex02;
import java.util.ArrayList;

public class BasePorto {
    private String nome;
    private ArrayList<Barco> barcosAtracados = new ArrayList<>();



    BasePorto(String nome){
        this.nome = nome;
    }

    public ArrayList<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atracarBarco(Barco barco){
        this.barcosAtracados.add(barco);
    }

    public void desatacarBarco(Barco barco){
        this.barcosAtracados.remove(barco);
    }

}
