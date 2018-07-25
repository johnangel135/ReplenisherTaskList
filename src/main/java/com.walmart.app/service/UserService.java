package com.walmart.app.service;

import com.walmart.app.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
