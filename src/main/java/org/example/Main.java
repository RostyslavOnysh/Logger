package org.example;

import org.example.services.AuthenticationService;
import org.example.services.AuthenticationServiceImpl;

import javax.naming.AuthenticationException;

public class Main {
    public static void main(String[] args) throws AuthenticationException {
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        authenticationService.login("bill","123");
    }
}
