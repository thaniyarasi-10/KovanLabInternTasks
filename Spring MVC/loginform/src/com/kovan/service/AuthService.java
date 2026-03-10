package com.kovan.service;

import com.kovan.model.User;

/**
 * The Business Logic Service (Part of the Model layer).
 * This service handles authentication logic, separating it from the Controller.
 */
public class AuthService {

    /**
     * Authenticates a user based on provided credentials.
     * In a real-world scenario, this would query a database using JDBC via a DAO
     * class.
     */
    public User authenticate(String username, String password) {
        // Hardcoded authentication for demonstration
        if ("admin".equals(username) && "admin123".equals(password)) {
            return new User(username, "Administrator");
        } else if ("user".equals(username) && "user123".equals(password)) {
            return new User(username, "Standard User");
        }

        return null; // Authentication failed
    }
}
