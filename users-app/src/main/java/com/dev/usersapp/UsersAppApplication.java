package com.dev.usersapp;

import com.dev.usersapp.entities.User;
import com.dev.usersapp.repositories.UserRepository;
import com.github.javafaker.Faker;
import com.sun.glass.ui.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersAppApplication implements ApplicationRunner {

    @Autowired
    private Faker faker;

    @Autowired
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(UsersAppApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*
        for (int i = 0; i <= 100; i++){
            User user = new User();
            user.setUsername(faker.name().username());
            user.setPassword(faker.dragonBall().character());
            repository.save(user);

        }
        */


    }
}
