package com.example.pokemoncards.service;

import com.example.pokemoncards.mapper.PokemonMapper;
import com.example.pokemoncards.model.PokemonModel;
import com.example.pokemoncards.model.PokemonResponse;
import org.apache.ibatis.session.SqlSession;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    RestTemplate restTemplate;
    private final SqlSession sqlSession;

    public PokemonService(RestTemplateBuilder restTemplateBuilder, SqlSession sqlSession) {
        this.restTemplate = restTemplateBuilder.build();
        this.sqlSession = sqlSession;
    }

    public List<PokemonModel> getPokemonsFromDB() {
        PokemonMapper pokemonMapper = sqlSession.getMapper(PokemonMapper.class);
        return pokemonMapper.getPokemonsFromDB();
    }


//    --------------------

    public List<PokemonModel> getPokemons() {
        String url = "https://pokeapi.co/api/v2/pokemon";
        PokemonResponse response = restTemplate.getForObject(url, PokemonResponse.class);
        assert response != null;
        ArrayList<PokemonModel> pokemons = new ArrayList<>(response.getResults());
        this.populatePokemonTableWithAPIResults(pokemons);
        return pokemons;
    }

    public void populatePokemonTableWithAPIResults(ArrayList<PokemonModel> pokemons) {
        PokemonMapper pokemonMapper = sqlSession.getMapper(PokemonMapper.class);
        for (PokemonModel pokemon : pokemons) {
            pokemonMapper.populatePokemonTableWithAPIResults(pokemon);
        }
    }
}
