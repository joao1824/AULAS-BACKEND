package com.example.q1;


import com.example.q1.models.Jogador;
import com.example.q1.models.Principal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/principal")
public class Q1controller {

    Principal principal;

    public Q1controller() {


        List<Jogador> titulares = new ArrayList<>();
        titulares.add(new Jogador("João", "Goleiro", 28));
        titulares.add(new Jogador("Carlos", "Zagueiro", 30));
        titulares.add(new Jogador("Pedro", "Zagueiro", 27));
        titulares.add(new Jogador("Lucas", "Lateral Direito", 25));
        titulares.add(new Jogador("Marcos", "Lateral Esquerdo", 26));
        titulares.add(new Jogador("Rafael", "Volante", 29));
        titulares.add(new Jogador("Gustavo", "Meio-Campo", 24));
        titulares.add(new Jogador("Thiago", "Meio-Campo", 28));
        titulares.add(new Jogador("Bruno", "Atacante", 27));
        titulares.add(new Jogador("Felipe", "Atacante", 26));
        titulares.add(new Jogador("Diego", "Atacante", 25));



        List<Jogador> listaReservas = new ArrayList<>();
        listaReservas.add(new Jogador("André", "Goleiro", 24));
        listaReservas.add(new Jogador("Vinícius", "Zagueiro", 22));
        listaReservas.add(new Jogador("Leonardo", "Lateral Direito", 23));
        listaReservas.add(new Jogador("Fernando", "Meio-Campo", 25));
        listaReservas.add(new Jogador("Mateus", "Atacante", 24));

        this.principal = new Principal(titulares,listaReservas);

    }

    @GetMapping
    public List<Jogador> getJogadores() {
        return principal.getJogadores();
    }

    @PostMapping("{posicao}")
    public List<Jogador> mudarPosicao(@PathVariable String posicao) {

        return principal.mudarJogador(posicao);

    }



}
