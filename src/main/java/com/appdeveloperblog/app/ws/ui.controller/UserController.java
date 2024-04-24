package com.appdeveloperblog.app.ws.ui.controller;


import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("users")  //https://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page" ,defaultValue="1") int page  ,@RequestParam(value="limit",defaultValue = "50")int limit, @RequestParam(value = "sort", required = false)String sort ){
        return "no.of pages = "+ page + "limit ="+limit+"sort = "+sort ;//http://localhost:8080/users?page=1&limit=50
    }

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
