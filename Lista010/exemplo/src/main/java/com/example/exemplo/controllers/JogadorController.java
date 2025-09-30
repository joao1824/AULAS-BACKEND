package com.example.exemplo.controllers;


import com.example.exemplo.models.Jogador;
import com.example.exemplo.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private JogadorService jogadorService;

    public JogadorController(JogadorService jogadorService){
        this.jogadorService = jogadorService;
    }


    @PostMapping
    public Jogador saveJogador(@RequestBody Jogador jogador){
        return jogadorService.saveJogador(
                jogador.getNome(),
                jogador.getSobrenome(),
                jogador.getPosicao()
        );
    }

    @GetMapping
    public List<Jogador> getAllJogadores(){
       return jogadorService.getAllJogadores();
    }

    @GetMapping()
    public Optional<Jogador> getOneJogador(@RequestBody Integer id){
        return jogadorService.getOneJogador(id);
    }




}
