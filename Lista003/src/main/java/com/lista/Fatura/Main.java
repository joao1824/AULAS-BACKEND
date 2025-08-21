package com.lista.Fatura;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("01", "Teclado", 100, 100.00);
        Double total = fatura.getTotalFatura();
        System.out.println("Total de fatura: " + total);
    }
}