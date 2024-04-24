package com.appdeveloperblog.app.ws.userservice.implementor;

import com.appdeveloperblog.app.ws.ui.model.request.UserDetailRequest;
import com.appdeveloperblog.app.ws.ui.model.response.UserDetails;
import com.appdeveloperblog.app.ws.userservice.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImplementation implements UserService {
    Map<String , UserDetails> user;
    public UserDetails createUser(UserDetailRequest userDetailRequest) {
        UserDetails userDetail = new UserDetails();
        userDetail.setEmail(userDetailRequest.getEmail());
        userDetail.setFirstName(userDetailRequest.getFirstName());
        userDetail.setLastName(userDetailRequest.getLastName());
        String userId = UUID.randomUUID().toString();
        userDetail.setUserId(userId);
        if (user == null) user = new HashMap<>();
        user.put(userId, userDetail);
        return userDetail;

    }
}
