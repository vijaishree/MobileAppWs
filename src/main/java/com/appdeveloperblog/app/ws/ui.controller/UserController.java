package com.appdeveloperblog.app.ws.ui.controller;

import com.appdeveloperblog.app.ws.ui.model.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")  //https://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(@RequestParam(value = "page" ,defaultValue="1") int page  ,@RequestParam(value="limit",defaultValue = "50")int limit, @RequestParam(value = "sort", required = false)String sort ){
        return "no.of pages = "+ page + "limit ="+limit+"sort = "+sort ;//http://localhost:8080/users?page=1&limit=50
    }

    @GetMapping(path="/{userId}")
    public UserDetails getUser(@PathVariable String userId){
        UserDetails userDetail = new UserDetails();
        userDetail.setEmail("vijaishreeseenivasagan@gmail.com");
        userDetail.setFirstName("Vijai Shree");
        userDetail.setLastName("Seenivasagan");
        return userDetail;
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
