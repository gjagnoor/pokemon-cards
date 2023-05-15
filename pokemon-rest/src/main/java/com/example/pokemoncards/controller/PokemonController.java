package com.example.pokemoncards.controller;

import com.example.pokemoncards.model.PokemonModel;
import com.example.pokemoncards.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonController {

    private PokemonService pokemonService;

    @Autowired
    public PokemonController (PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons")
    public List<PokemonModel> getPokemonsFromDB() {
        return pokemonService.getPokemonsFromDB();
    }

    @GetMapping("/populate")
    public List<PokemonModel> getPokemonList() {
        return pokemonService.getPokemons();
    }
}
