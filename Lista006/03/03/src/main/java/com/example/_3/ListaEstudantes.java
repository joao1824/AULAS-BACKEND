package com.example._3;
import com.example._3.Estudante;
import java.util.ArrayList;
import java.util.Objects;

public class ListaEstudantes {
    private final ArrayList<Estudante> estudantes_lista = new ArrayList<Estudante>();

    ListaEstudantes(){}

    public void AdicionarEstudante(Estudante estudante){
        this.estudantes_lista.add(estudante);
    }

    public ArrayList<Estudante> TodosEstudantes(){
        return this.estudantes_lista;
    }

    public Estudante UmEstudante(String codigo){
        for (Estudante estudante:this.estudantes_lista){
            if (Objects.equals(estudante.getCodigo(), codigo)){
                return estudante;
            }
        }
        return null;
    }

}
