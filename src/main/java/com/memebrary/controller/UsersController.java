package com.memebrary.controller;

import com.memebrary.model.User;
import com.memebrary.respository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsersController {

    private final UserJpaRepository userJpaRepository;

    @Autowired
    public UsersController(UserJpaRepository userJpaRepository) {
        this.userJpaRepository = userJpaRepository;
    }

    @GetMapping(value = "/all")
    public List<User> findAll() {
        return userJpaRepository.findAll();
    }


    @GetMapping(value = "/{name}")
    public User findByName(@PathVariable final String name) {
        return userJpaRepository.findByName(name);
    }

    @PostMapping(value = "/create")
    public User create(@RequestBody final User user) {
        userJpaRepository.save(user);
        return userJpaRepository.findByName(user.getName());
    }
}
