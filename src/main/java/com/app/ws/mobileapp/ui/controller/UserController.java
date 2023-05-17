package com.app.ws.mobileapp.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ws.mobileapp.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUsers(){
        return "get user was called";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}