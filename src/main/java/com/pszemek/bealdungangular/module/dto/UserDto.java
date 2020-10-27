package com.pszemek.bealdungangular.module.dto;

public class UserDto {
    private String uuid;
    private String name;
    private String email;

    public String getUuid() {
        return uuid;
    }

    public UserDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }
}
