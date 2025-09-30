package com.example.exemplo.controllers;


import com.example.exemplo.models.Jogador;
import com.example.exemplo.services.JogadorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogadores")
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

    @DeleteMapping
    public List<Jogador> deleteJogdor(@RequestBody Jogador jogador){
        return jogadorService.deleteJogador(jogador.getId());
    }


    @GetMapping("/jogadores/jogador")
    public Jogador getOneJogador(@RequestBody Jogador jogador){
        return jogadorService.getOneJogador(jogador.getId());
    }


    @GetMapping("/joagador/{nome}")
    public List<Jogador> getJogadorebyNome(@PathVariable Jogador jogador){
        return jogadorService.findJogadoresByNome(jogador.getNome());
    }

}
