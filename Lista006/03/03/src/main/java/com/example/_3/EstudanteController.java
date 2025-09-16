package com.example._3;

import org.springframework.web.bind.annotation.*;
import org.example.Estudante;

@RestController
@RequestMapping("/Estudante")

public class EstudanteController {
    @PostMapping
    public Estudante novoEstudante(@RequestBody Estudante estudante ){
        return estudante;
    }




}
