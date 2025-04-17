package com.freddy.curso.springboot.webapp.springboot_web.controllers;


import com.freddy.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSourceAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/params/")
public class RequestParamsController {


    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(required = false, defaultValue = "No hay mensaje") String message) {
        ParamDTO paramDTO = new ParamDTO();
        paramDTO.setMessage(message);

        return paramDTO;
    }

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDTO params = new ParamDTO();

        params.setCode(code);
        params.setMessage(text);
        return params;
    }

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest request){
        ParamDTO paramDTO = new ParamDTO();
        Integer code = 0;
        try{
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }
        paramDTO.setCode(code);
        paramDTO.setMessage(request.getParameter("message"));
        return paramDTO;
    }
}
