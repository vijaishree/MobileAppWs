package com.appdeveloperblog.app.ws.ui.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")  //https://localhost:8080/users
public class UserController {

    @GetMapping(path="/{userId}")
    public String getUser(@PathVariable String userId){
        return "get userId = "+ userId ;
    }

    @PostMapping
    public String createUser(){
        return "create user";
    }

    @PutMapping
    public String updateUser(){
        return "update user";

    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user";
    }
    
}
