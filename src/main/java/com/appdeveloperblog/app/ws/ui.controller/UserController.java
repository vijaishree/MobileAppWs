package com.appdeveloperblog.app.ws.ui.controller;


import com.appdeveloperblog.app.ws.ui.model.request.UserDetailRequest;
import com.appdeveloperblog.app.ws.ui.model.response.UserDetails;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("users")  //https://localhost:8080/users
public class UserController {

    Map<String,UserDetails> user  ;

    @GetMapping
    public String getUser(@RequestParam(value = "page" ,defaultValue="1") int page  ,
                          @RequestParam(value="limit",defaultValue = "50")int limit,
                          @RequestParam(value = "sort", required = false)String sort ){
        return "no.of pages = "+ page + "limit ="+limit+"sort = "+sort ;//http://localhost:8080/users?page=1&limit=50
    }

    @GetMapping(path="/{userId}",
                produces = {MediaType.APPLICATION_XML_VALUE ,
                            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserDetails> getUser(@PathVariable String userId){

        UserDetails userDetail = new UserDetails();
        if(user.containsKey(userId)){
            return new ResponseEntity<>(user.get(userId), HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.NO_CONTENT);



    }

    @PostMapping(consumes ={MediaType.APPLICATION_XML_VALUE ,
                            MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_XML_VALUE ,
                            MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserDetails> createUser(@Valid @RequestBody UserDetailRequest userDetailRequest){
        UserDetails userDetail = new UserDetails();
        userDetail.setEmail(userDetailRequest.getEmail());
        userDetail.setFirstName(userDetailRequest.getFirstName());
        userDetail.setLastName(userDetailRequest.getLastName());
        String userId = UUID.randomUUID().toString();
        userDetail.setUserId(userId);

        if(user == null) user = new HashMap<>();
        user.put(userId , userDetail);
        return new ResponseEntity<UserDetails>(userDetail, HttpStatus.OK);
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
