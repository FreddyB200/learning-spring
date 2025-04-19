package com.freddy.curso.springboot.webapp.springboot_web.controllers.web;

import com.freddy.curso.springboot.webapp.springboot_web.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/list")
    public String listUsers(Model model){
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("titulo", "Gestión de Usuarios");
        return "user-list";
    }

    @GetMapping("/details/{id}")
    public String getUserDetails(@PathVariable int id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "user-details";
    }

}
