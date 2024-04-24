package com.appdeveloperblog.app.ws.ui.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class UserDetailRequest {
    @NotNull(message="Cannot be empty")
    private String firstName;
    @NotNull(message="Cannot be empty")
    private String lastName;
    @NotNull(message="Cannot be empty")
    @Email
    private String email;
    @NotNull
    @Size(min=8,max =16,message="Size must be 8-16 charaters")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
