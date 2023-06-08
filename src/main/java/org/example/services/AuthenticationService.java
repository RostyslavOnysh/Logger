package org.example.services;

import org.example.model.User;

import javax.naming.AuthenticationException;

public interface AuthenticationService {
    User login (String login, String password) throws AuthenticationException;

}
