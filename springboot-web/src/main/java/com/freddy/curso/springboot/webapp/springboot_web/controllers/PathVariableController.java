package com.freddy.curso.springboot.webapp.springboot_web.controllers;


import com.freddy.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/baz/{message}/{code}")
    public ParamDTO baz(@PathVariable String message, @PathVariable Integer code){

        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setCode(code);
        paramDTO.setMessage(message);
        return paramDTO;
    }

}
