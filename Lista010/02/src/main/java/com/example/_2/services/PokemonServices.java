package com.example._2.services;

import com.example._2.models.Pokemon;
import org.springframework.stereotype.Service;
import com.example._2.repository.PokemonRepository;

import java.util.List;

@Service
public class PokemonServices {
    private PokemonRepository pokemonRepository;

    public PokemonServices(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> lista = pokemonRepository.findAll();
        if (lista != null) {
            return lista;
        }
        throw new RuntimeException("Não tem pokemon registrado");
    }

    public Pokemon getPokemonById(Integer id) {
        return pokemonRepository.findById(id).orElseThrow(() -> new RuntimeException("Pokemon nao encontrado"));
    }

    public List<Pokemon> addPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
        return pokemonRepository.findAll();
    }

    public List<Pokemon> updatePokemon(Pokemon pokemon) {
        Pokemon pokemon_encontrado = pokemonRepository.findById(pokemon.getId()).orElseThrow(() -> new RuntimeException("Pokemon não encontrado"));
        pokemon_encontrado.setNome(pokemon.getNome());
        pokemon_encontrado.setTipo(pokemon.getTipo());
        pokemon_encontrado.setGeracao(pokemon.getGeracao());
        pokemonRepository.save(pokemon_encontrado);
        return pokemonRepository.findAll();
    }

    public List<Pokemon> deletePokemon(Integer id) {
        pokemonRepository.deleteById(id);
        return pokemonRepository.findAll();
    }
}
