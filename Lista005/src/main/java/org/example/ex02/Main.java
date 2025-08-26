package org.example.ex02;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        PortoGrande portoGrande = new PortoGrande("PortoA");
        PortoPequeno portoPequeno = new PortoPequeno("PortoB");

        Barco barcoF = new Barco(43,"F");
        Barco barcoG = new Barco(7,"G");
        Barco barcoH = new Barco(63,"H");
        Barco barcoI = new Barco(20,"I");
        Barco barcoJ = new Barco(4,"J");

        Barco[] barcosLista = {barcoF,barcoG,barcoI,barcoJ,barcoH};
        ArrayList<Barco> barcosArrayLista = new ArrayList<>();
        barcosArrayLista.addAll(Arrays.asList(barcosLista));

        for (Barco barco : barcosArrayLista) {
            if (barco.getTamanho() <= 10){
                portoPequeno.atracarBarco(barco);
            }else {
                portoGrande.atracarBarco(barco);
            }
        }

    }
}
