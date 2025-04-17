package com.freddy.curso.springboot.webapp.springboot_web.services;

import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import com.freddy.curso.springboot.webapp.springboot_web.models.dto.UserDTO;
import com.freddy.curso.springboot.webapp.springboot_web.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers(){
        return userRepository.findAll();

    }

    public User getUserById(int id){
        return userRepository.findById(id);
    }
}
