package com.example.pokemoncards.mapper;

import com.example.pokemoncards.model.ScoreModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    ScoreModel getScoreByGameId();

    void updateScoreByGameId();

}
