package com.example._2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Random;

@RestController
public class ApplicationController {
    @GetMapping("/jogador/{time}/{posicao}")
    public String JogadorService(@PathVariable("time") String time, @PathVariable("posicao") String posicao){
        Random radomizador = new Random();

        String[] nome = {"João", "Silva", "Vando"};
        String[] sobreNome = {"Ramos", "Silva", "DLaqua"};

        return " Nome - " + nome[radomizador.nextInt(0,3)] + " SobreNome - " + sobreNome[radomizador.nextInt(0,3)] +
                " Idade - " + radomizador.nextInt(18,101) + " Posição - " + posicao + " Time - " + time;

    }



}
