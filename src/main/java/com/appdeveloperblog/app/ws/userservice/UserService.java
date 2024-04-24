package com.appdeveloperblog.app.ws.userservice;

import com.appdeveloperblog.app.ws.ui.model.request.UserDetailRequest;
import com.appdeveloperblog.app.ws.ui.model.response.UserDetails;

public interface UserService {
    UserDetails createUser(UserDetailRequest userDetailRequest);
}
