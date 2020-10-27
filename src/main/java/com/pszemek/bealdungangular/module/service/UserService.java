package com.pszemek.bealdungangular.module.service;

import com.pszemek.bealdungangular.module.entity.UserEntity;
import com.pszemek.bealdungangular.module.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserEntity> getUsers(){
        return repository.findAll();
    }

    public UserEntity create(UserEntity entity){
        return repository.saveAndFlush(entity);
    }
}
