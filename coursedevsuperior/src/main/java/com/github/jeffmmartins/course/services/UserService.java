package com.github.jeffmmartins.course.services;

import com.github.jeffmmartins.course.entities.User;
import com.github.jeffmmartins.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    //uma operação na cadamda de serviços que repassa a chamada para o repository
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
