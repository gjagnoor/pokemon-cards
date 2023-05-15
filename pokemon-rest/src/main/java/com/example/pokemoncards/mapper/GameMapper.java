package com.example.pokemoncards.mapper;

import com.example.pokemoncards.model.GameModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GameMapper {
    GameModel getGameByUserID();

    void updateGameByGameID();

    void createGame();

}
