package com.example.pokemoncards.model;

import java.util.List;

public class PokemonModel {
    private String name;
    private String url;

    public PokemonModel(String name, String imgUrl) {
        this.name = name;
        this.url = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
