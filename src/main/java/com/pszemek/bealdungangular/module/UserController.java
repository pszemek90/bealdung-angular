package com.pszemek.bealdungangular.module;

import com.pszemek.bealdungangular.module.dto.UserDto;
import com.pszemek.bealdungangular.module.entity.UserEntity;
import com.pszemek.bealdungangular.module.mapper.UserMapper;
import com.pszemek.bealdungangular.module.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserDto> getUsers(){
        return UserMapper.map(userService.getUsers());
    }

    @PostMapping("/users")
    public UserDto addUser(@RequestBody UserEntity userEntity){
        return UserMapper.map(userService.create(userEntity));
    }
}
