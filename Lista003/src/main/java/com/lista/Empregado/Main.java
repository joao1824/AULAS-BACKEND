package com.lista.Empregado;

public class Main {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Pedro", "Predroso",2000.00);
        Empregado e2 = new Empregado("Rocha", "Rochoso",4000.00);

        System.out.println("Salario Anual do Primeiro: " + e1.SalaraioAnual());
        System.out.println("Salario Anual do Segundo: " + e2.SalaraioAnual());
        e1.setSalarioMensal(e1.getSalarioMensal()*1.1);
        e2.setSalarioMensal(e2.getSalarioMensal()*1.1);
        System.out.println("Salario Anual do Primeiro: " + e1.SalaraioAnual());
        System.out.println("Salario Anual do Segundo: " + e2.SalaraioAnual());


    }
}
