package com.example.pokemoncards.mapper;

import com.example.pokemoncards.model.UserModel;

public interface UserMapper {
    UserModel getUserById();

    void updateUserById();

    void createUser();
}
