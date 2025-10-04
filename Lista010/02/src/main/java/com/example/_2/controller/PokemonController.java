package com.example._2.controller;

import com.example._2.models.Pokemon;
import org.springframework.web.bind.annotation.*;
import com.example._2.services.PokemonServices;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private PokemonServices pokemonServices;

    public PokemonController(PokemonServices pokemonServices) {
        this.pokemonServices = pokemonServices;
    }

    @GetMapping
    public List<Pokemon> todosPokemons() {
        return pokemonServices.getAllPokemon();
    }

    @PostMapping()
    public List<Pokemon> cadastrarPokemon(@RequestBody Pokemon pokemon) {
        pokemonServices.addPokemon(pokemon);
        return pokemonServices.getAllPokemon();
    }

    @PatchMapping
    public List<Pokemon> atualizarPokemon(@RequestBody Pokemon pokemon) {
        return pokemonServices.updatePokemon(pokemon);
    }

    @GetMapping("/{id}")
    public Pokemon buscarPokemon(@PathVariable Integer id){
        return pokemonServices.getPokemonById(id);
    }

    @DeleteMapping("/{id}")
    public List<Pokemon> removerPokemon(@PathVariable Integer id){
        return pokemonServices.deletePokemon(id);
    }
}
