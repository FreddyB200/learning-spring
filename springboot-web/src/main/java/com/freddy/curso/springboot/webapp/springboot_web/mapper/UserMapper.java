package com.freddy.curso.springboot.webapp.springboot_web.mapper;

import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import com.freddy.curso.springboot.webapp.springboot_web.dto.UserDTO;
import org.springframework.stereotype.Component;


@Component
public class UserMapper {

    public UserDTO toDTO(User user){
        String fullname = user.getFirstName() + " " + user.getLastName();
        return UserDTO.builder()
                .id(user.getId())
                .fullName(fullname)
                .email(user.getEmail())
                .build();
    }

}
