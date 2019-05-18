package com.memebrary.service;

import com.memebrary.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}