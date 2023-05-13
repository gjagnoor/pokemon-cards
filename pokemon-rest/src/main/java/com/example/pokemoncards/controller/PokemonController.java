package com.example.pokemoncards.controller;

import com.example.pokemoncards.model.PokemonModel;
import com.example.pokemoncards.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/pokemoncards")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/populate")
    public List<PokemonModel> getPokemonList() {
        return pokemonService.getPokemons();
    }
}
