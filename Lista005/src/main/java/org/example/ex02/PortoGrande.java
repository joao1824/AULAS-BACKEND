package org.example.ex02;

public class PortoGrande extends BasePorto {
    public PortoGrande(String nome){
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco){
        if (barco.getTamanho() >= 10){
            super.atracarBarco(barco);
            System.out.println(barco.getNome() +" atracado com sucesso no porto GRANDE!");
        }
    }
}
