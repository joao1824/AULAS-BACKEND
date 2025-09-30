package com.example.exemplo.services;


import com.example.exemplo.models.Jogador;
import com.example.exemplo.repository.JogadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogadorService {
    private JogadorRepository jogadorRepository;

    public JogadorService(JogadorRepository jogadorRepository){
        this.jogadorRepository = jogadorRepository;
    }



    public Jogador saveJogador(String nome,String sobrenome,String posicao){
        Jogador novoJogador = new Jogador();
        novoJogador.setNome(nome);
        novoJogador.setSobrenome(sobrenome);
        novoJogador.setClube("ESTADOS_UNIDOS");
        novoJogador.setPosicao(posicao);
        novoJogador.setIdade(400);
        jogadorRepository.save(novoJogador);
        return novoJogador;
    }

    public List<Jogador> getAllJogadores(){
        return jogadorRepository.findAll();
    }

    public Jogador getOneJogador(Integer id){
        return jogadorRepository.findById(id).orElse(null);
    }

    public List<Jogador> deleteJogador(Integer id){
        jogadorRepository.deleteById(id);
        return jogadorRepository.findAll();
    }

    public List<Jogador> findJogadoresByNome(String nome){
        return jogadorRepository.findAllByNome(nome);
    }




}
