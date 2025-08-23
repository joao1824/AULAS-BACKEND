package com.lista.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.Year;

public class Data {
    private int mes;
    private int dia;
    private int ano;


    List<Integer> mes31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
    List<Integer> mes30 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));

    private int diasMes(int mes, int ano) {
        Year ano_b = Year.of(ano);
        if (mes31.contains(mes)) {
            return 31;
        }
        if (mes30.contains(mes)) {
            return 30;
        }
        if (mes < 1 || mes > 12) return 0;
        return Year.of(ano).isLeap() ? 29 : 28;
    }

    private Boolean validarData(int dia,int mes, int ano){
        if (diasMes(mes,ano) >= dia){
            return true;
        }
        return false;
    }


    Data(int dia,int mes,int ano){
       if (validarData(dia, mes, ano)){
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
       }else {
           System.out.println("Data invalida");
       }
    }


    public int getMes(){
        return mes;
    }

    public int getDia(){
        return dia;
    }

    public int getAno(){
        return ano;
    }

    public void setMes(int mes){
        if (validarData(this.dia, mes, this.ano)){
            this.mes = mes;
        }else {
            System.out.println("Data invalida");
        }
    }

    public void setDia(int dia){
        if (validarData(dia, this.mes, this.ano)){
            this.dia = dia;
        }else {
            System.out.println("Data invalida");
        }
    }

    public void setAno(int ano){
        if (validarData(this.dia, this.mes, ano)){
            this.ano = ano;
        }else {
            System.out.println("Data invalida");
        }
    }

    public void Exibir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }



}
