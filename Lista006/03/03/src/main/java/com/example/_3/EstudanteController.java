package com.example._3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;

@RestController
public class EstudanteController {

    public final ListaEstudantes listaEstudantes = new ListaEstudantes();


    @PostMapping("/Estudante")

    public ResponseEntity<Estudante> novoEstudante(@RequestBody Estudante estudante ){
        listaEstudantes.AdicionarEstudante(estudante);
        return ResponseEntity.ok(estudante);
    }


    @GetMapping("/Estudante")

    public ArrayList<Estudante> todosEstudantes(){
        return this.listaEstudantes.TodosEstudantes();
    }

    @RequestMapping("/Estudante/{codigo}")

    public ResponseEntity<Estudante> umEstudante(@PathVariable ("codigo") String codigo){
        if (listaEstudantes.UmEstudante(codigo) == null){
            throw new NoSuchElementException("Recurso com ID " + codigo + " não encontrado.");
        }else {
            return ResponseEntity.ok(listaEstudantes.UmEstudante(codigo));
        }
    }


}
