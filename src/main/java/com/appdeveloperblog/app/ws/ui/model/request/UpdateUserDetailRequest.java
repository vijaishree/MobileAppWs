package com.appdeveloperblog.app.ws.ui.model.request;

import jakarta.validation.constraints.NotNull;

public class UpdateUserDetailRequest {
    @NotNull(message = "Cannot be empty")
    private String firstName ;
    @NotNull(message = "Cannot be empty")
    private String lastName ;

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
