package com.pszemek.bealdungangular.module.mapper;

import com.pszemek.bealdungangular.module.dto.UserDto;
import com.pszemek.bealdungangular.module.entity.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto map(UserEntity entity){
        return new UserDto()
                .setUuid(entity.getUuid())
                .setName(entity.getName())
                .setEmail(entity.getEmail());
    }

    public static List<UserDto> map(List<UserEntity> entities){
        return entities.stream()
                .map(UserMapper::map)
                .collect(Collectors.toList());
    }
}
