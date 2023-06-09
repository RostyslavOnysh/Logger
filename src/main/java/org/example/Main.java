package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.services.AuthenticationService;
import org.example.services.AuthenticationServiceImpl;

import javax.naming.AuthenticationException;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        AuthenticationService authenticationService = new AuthenticationServiceImpl();
        try {
            authenticationService.login("bill","124");
        } catch (AuthenticationException e) {
           logger.error("Can`t login",e);
        }
    }
}
