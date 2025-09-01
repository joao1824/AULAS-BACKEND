package org.example.ex5;
import java.util.ArrayList;


public class Cinema {
    private ArrayList<Filme> filmesDisponiveis;
    private ArrayList<Ingresso> ingressosVendidos;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nome) throws Exception {
        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        throw new Exception("Filme não encontrado!");
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {

        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso nao pode ser vendido pois sua idade não permite!");
        }


        for (Ingresso i : ingressosVendidos) {
            if (i.getAssento().equalsIgnoreCase(assento)) {
                throw new Exception("O ingresso nao pode ser vendido pois seu assento não está mais disponível!");
            }
        }

        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        System.out.println(ingresso);
    }
}
