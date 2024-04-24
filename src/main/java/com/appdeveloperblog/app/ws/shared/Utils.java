package com.appdeveloperblog.app.ws.shared;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class Utils {
    public String generateuserId(){
        return UUID.randomUUID().toString();
    }
}
