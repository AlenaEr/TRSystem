package com.cbsgenesis.trmsystem.service;

/**
 * Service for security purposes.
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
