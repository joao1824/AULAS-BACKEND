package com.example._1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/")



    public String perguntaResposta(@RequestParam String clima, String estilo){

        if (clima.equals("calor") && estilo.equals("natureza")){
            return "Rio De Janeiro";
        }
        if (estilo.equals("calor") && estilo.equals("deserto")){
            return "Egito";
        }
        if (estilo.equals("frio") && estilo.equals("neve")){
            return "Russia";
        }
        if (estilo.equals("Frio") && estilo.equals("dios")){
            return "Rio Grande do Sul";
        }

        return "Nada1";

    }
}
