package com.freddy.curso.springboot.webapp.springboot_web.dto;

import com.freddy.curso.springboot.webapp.springboot_web.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private int id;
    private String fullName;
    private String email;

}

