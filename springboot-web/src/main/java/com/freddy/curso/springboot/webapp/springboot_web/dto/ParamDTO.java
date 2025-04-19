package com.freddy.curso.springboot.webapp.springboot_web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParamDTO {

    private String message;
    private Integer code;

}
