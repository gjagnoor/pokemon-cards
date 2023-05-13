package com.example.pokemoncards.service;

import com.example.pokemoncards.model.PokemonModel;
import com.example.pokemoncards.model.PokemonResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokemonService {
    RestTemplate restTemplate;

    public PokemonService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<PokemonModel> getPokemons() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        PokemonResponse response = restTemplate.getForObject(url, PokemonResponse.class);
        assert response != null;
        return response.getResults();
    }
}
