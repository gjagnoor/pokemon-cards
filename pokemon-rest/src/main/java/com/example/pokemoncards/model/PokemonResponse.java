package com.example.pokemoncards.model;


import java.util.List;

public class PokemonResponse {
    private List<PokemonModel> results;

    public List<PokemonModel> getResults() {
        return results;
    }

    public void setResults(List<PokemonModel> results) {
        this.results = results;
    }
}
