package com.freddy.curso.springboot.webapp.springboot_web.controllers;

import com.freddy.curso.springboot.webapp.springboot_web.mapper.UserMapper;
import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import com.freddy.curso.springboot.webapp.springboot_web.models.dto.UserDTO;
import com.freddy.curso.springboot.webapp.springboot_web.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {
    private UserMapper userMapper;
    private final UserService userService;

    @Autowired
    public UserRestController(UserService userService, UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        Map<String, Object> body = new HashMap<>();
        User user = new User(1, "Freddy", "bautista", "abs0rbmejohan@example.com", "estudiante / desarrolador");

        body.put("title", "Hola mundo Spring Boot");
        body.put("fullname", user.getFirstName() + " " + user.getLastName());
        body.put("user", user);
        return body;
    }

    @GetMapping("/details")
    public UserDTO details(){
        User user = new User(1, "Freddy", "bautista", "abs0rbmejohan@example.com", "estudiante / desarrolador");
        UserDTO userDTO = userMapper.toDTO(user);
        return userDTO;
    }

    @GetMapping("/users")
    public List<User> listUsers(){
        return userService.getAllUsers();
    }



}
