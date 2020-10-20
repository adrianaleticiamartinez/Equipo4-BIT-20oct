package com.dev.usersapp.services;

import com.dev.usersapp.entities.User;
import com.dev.usersapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Page<User> getUser(Integer page, Integer size){
        return userRepository.findAll(PageRequest.of(page, size));
    }

    public Page<String> getUsernames(Integer page, Integer size){
        return userRepository.findUsernames(PageRequest.of(page, size));
    }


    public User getUserById(Integer userId){
        return userRepository.findById(userId)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User id %d not found", userId)));
    }

    public User getUserByUsername(String username){
        return userRepository.findByUsername(username)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User username %s not found", username)));

    }

    public User getUserByUsernameAndPassword(String username, String password){
        return userRepository.findByUsernameAndPassword(username, password)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User username %s not found", username)));

    }
}
