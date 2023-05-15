package com.example.pokemoncards.mapper;

import com.example.pokemoncards.model.PokemonModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PokemonMapper {

    @Select("SELECT * FROM pokemon")
    List<PokemonModel> getPokemonsFromDB();

    @Insert("INSERT INTO pokemon (name, url) VALUES (#{name}, #{url})")
    void populatePokemonTableWithAPIResults(PokemonModel pokemon);

}
