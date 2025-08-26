package org.example.ex02;

import java.util.ArrayList;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nome){
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco){
        if (barco.getTamanho() <= 10){
            super.atracarBarco(barco);
            System.out.println(barco.getNome() +" atracado com sucesso no porto PEQUENO!");
        }
    }
}
