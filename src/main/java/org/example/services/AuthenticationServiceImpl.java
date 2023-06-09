package org.example.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.model.User;

import javax.naming.AuthenticationException;

public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    public User login(String login, String password) throws AuthenticationException {
        logger.info("Login method was called. Params: login = {}",login);
        User user = findByLogin(login);
        if (!user.getPassword().equals(password)) {
            throw new AuthenticationException("Username or password incorrect");
        }
        return user;
    }

    private User findByLogin(String login) {
        return new User(login, "123");
    }
}
